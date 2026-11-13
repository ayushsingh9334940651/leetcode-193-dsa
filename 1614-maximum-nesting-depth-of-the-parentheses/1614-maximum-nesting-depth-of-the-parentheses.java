class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int count=0;
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
         if(ch=='('){
           count++;
           ans=Math.max(ans,count);
         } 
          if(s.charAt(i)==')') count--;
     }
     return ans;
    }
}