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
    public String shortestPalindrome(String s) {
      int n=s.length();
       String rev = new StringBuilder(s).reverse().toString();
         String temp = s + "#" + rev;
         int lps[] = lpsform(temp);
         for(int k=0;k<lps.length;k++){
            System.out.print(lps[k]+" ");
         }
         int longest = lps[temp.length()-1];
      StringBuilder ans=new StringBuilder();
       for(int i = n-1; i >= longest; i--){
            ans.append(s.charAt(i));
        }
        ans.append(s);
    return ans.toString();
    }
}