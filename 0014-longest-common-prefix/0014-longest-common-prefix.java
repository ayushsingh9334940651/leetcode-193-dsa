class Solution {
    public String longestCommonPrefix(String[] strs) {
       String ans="";
         if(strs.length==1) return strs[0];
           
          int j=0;int k=1;
          while(j<strs[0].length()){
          while( k<strs.length && j<strs[k].length() && strs[0].charAt(j)==strs[k].charAt(j)  ) k++;
            if(k==(strs.length)){
                 ans+=strs[0].charAt(j);
                 j++;
                 k=1;
              }else break; 
          }
         
          return ans;
    }
}