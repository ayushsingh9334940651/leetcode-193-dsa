class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
         int max=1;
        HashSet<Character> set=new HashSet<>();
        int i=0;int j=0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max=Math.max(max,j-i);
               
            }else{
              set.remove(s.charAt(i));
              i++;
            }
        }
        
        return max;
    }
}