class Solution {
    public int longestConsecutive(int[] nums) {
      int ans=0;
      HashSet<Integer> set=new HashSet<>();
      for(int ele:nums)   set.add(ele);
      for (int ele : set) {
            if (!set.contains(ele - 1)) {    
                int curr = ele;
                int len = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    len++;
                }
                ans = Math.max(ans, len);
            }
        }
      return ans;
    }
}