class Solution {
    private int[] lpsform(String str){
        int n=str.length();
      int lps[]=new int [n];
      int i=1;  int len=0;
      while(i<n){
        if(str.charAt(i)==str.charAt(len)){
            len++;
            lps[i]=len;
            i++;
        }else{
            if(len==0) i++;
            else  len=lps[len-1];
        }
       
      }
       return lps;
    }
    public int strStr(String haystack, String needle) {
     int lps[]=lpsform(needle);
     int i=0;int j=0;
     int n=haystack.length();   int m=needle.length();
     while(i<n){
        if(haystack.charAt(i)==needle.charAt(j)){
          i++;j++;
          if(j==m){
            return i-m;
          }
        }else{
            if (j==0) i++;
            else  j=lps[j-1];
        }
       
     }
      return -1;
    }
}