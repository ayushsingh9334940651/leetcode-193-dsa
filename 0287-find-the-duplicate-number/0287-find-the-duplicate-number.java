class Solution {
    public int findDuplicate(int[] nums) {
        int ans=0;
      HashSet<Integer> set= new HashSet<>();
      for(int i=0;i<nums.length;i++){
        if(!set.contains(nums[i])) set.add(nums[i]);
        else {
            ans=nums[i];
            break;
       }
      }
      return ans;
    }
}