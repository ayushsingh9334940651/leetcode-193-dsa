class Solution {
    public int lengthOfLongestSubstring(String s) {
         int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int j=0;int i=0;
        while(j<s.length()){
            Character c=s.charAt(j);
            if(!map.containsKey(c)){
                map.put(c,j);
                max=Math.max(max,map.size());
               j++;
            }else{
               while(s.charAt(i) != c){
                    map.remove(s.charAt(i));
                    i++;
                }

                map.remove(s.charAt(i));
                i++;
              }
            }
        
        return max;
    }
}