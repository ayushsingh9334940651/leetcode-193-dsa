class Solution {
    public String minWindow(String s, String t) {
      int m=s.length(); int n=t.length();
      String ans="";
      if(m<n) return ans;
      if(s.indexOf(t)<s.length() && s.indexOf(t)!=-1) return t;
      HashMap<Character,Integer> mapt=new HashMap<>();
      for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        mapt.put(ch,mapt.getOrDefault(ch,0)+1);
      }
      HashMap<Character,Integer> maps=new HashMap<>();
      int mst=0;
      int dmst=t.length();
      int i=0; int j=0;
      while(j<s.length()){
       while(j<s.length() && mst<dmst){
        char ch=s.charAt(j);
        maps.put(ch,maps.getOrDefault(ch,0)+1);
        if(maps.getOrDefault(ch,0)<=mapt.getOrDefault(ch,0)) mst++;
        j++;
       }
       while(i+(t.length())<=j && mst==dmst){
        String curr=s.substring(i,j);
        if(ans.length()==0 || ans.length()>curr.length()) ans=curr;
        char ch=s.charAt(i);
        int fre=maps.get(ch);
        if(fre==1) maps.remove(ch);
        else if(fre>1) maps.put(ch,fre-1);
        if(maps.getOrDefault(ch,0)<mapt.getOrDefault(ch,0)) mst--;
        i++;
       }
      }
      return ans;
    }
}