class Solution {
    public boolean isPalindrome(String s) {
        int st=0;int l=s.length()-1;
        while(st<l){
         if(!Character.isLetterOrDigit(s.charAt(st))){
           st++;
           continue;
         } 
         if(!Character.isLetterOrDigit(s.charAt(l))){ 
            l--;
            continue;
         }
         if(Character.toLowerCase(s.charAt(st))!=Character.toLowerCase(s.charAt(l))) return false;
         st++;
         l--;
        }
        return true;
    }
}