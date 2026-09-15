class Solution {
    public int compress(char[] chars) {
     if(chars.length==1) return 1;
     ArrayList<Character> ans=new ArrayList<>();
     int i=0;int j=0;
     while(j<chars.length){
     char ivalue=chars[i];
     while(j<chars.length && ivalue==chars[j]  ) j++;
     ans.add(ivalue);
     int put=j-i;
     if(put>1){
         String s = String.valueOf(put);
      for(int x = 0; x < s.length(); x++){
         ans.add(s.charAt(x));
       }
     }
     i=j;
     }
     if(chars.length<ans.size()) return chars.length;
       for(int k=0;k<ans.size();k++){
            chars[k]=ans.get(k);
        }
     return ans.size();
    }
}