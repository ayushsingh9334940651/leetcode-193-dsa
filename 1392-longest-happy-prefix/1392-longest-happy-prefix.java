class Solution {
    public String longestPrefix(String s) {
        int len=0;
        int lps[]=new int[s.length()];
        lps[0]=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(len)==s.charAt(i)){
                len++;
                lps[i]=len;
            }else{
                if(len!=0){
                  len=lps[len-1];
                  i--;
                }else lps[i]=0;
            }
        }
    
      int ans=lps[s.length()-1];
      return s.substring(0,ans);
    }
}