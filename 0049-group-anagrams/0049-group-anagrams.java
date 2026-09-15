class Solution {
    private boolean isanagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Integer> hs1=new HashMap<>();
        HashMap<Character,Integer> hs2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
         char ch=s1.charAt(i);
         if(hs1.containsKey(ch)){
            int frq=hs1.get(ch);
         hs1.put(ch,frq+1);
         }
         else hs1.put(ch,1);
        }
        for(int i=0;i<s2.length();i++){
         char ch=s2.charAt(i);
         if(!hs1.containsKey(ch)) return false;
         if(hs2.containsKey(ch)){
            int freq=hs2.get(ch);
            hs2.put(ch,freq+1);
         }else hs2.put(ch,1);
        }
     for(int i=0;i<s2.length();i++){
        char ch=s1.charAt(i);
        int freq1=hs1.get(ch);
        int freq2=hs2.getOrDefault(ch, 0);
        if(freq1!=freq2) return false;
     }
     return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<List<String>> ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
         if(!set.contains(i)){
         ArrayList<String> help=new ArrayList<>();
             help.add(strs[i]);
             set.add(i);
             int j=i+1;
         while(j<strs.length){
          if(isanagram(strs[i],strs[j]) && !set.contains(j)){
            help.add(strs[j]);
            set.add(j);
          }
          j++;
         }
          ans.add(help);
        }
        }
        return ans;
    }
}