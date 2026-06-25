class Solution {
 public int maxSubArray(int[] nums) {
   int largest=nums[0];
    int cs=nums[0];
    for(int i=1;i<nums.length;i++){
       cs=Math.max(cs+nums[i],nums[i]);
    
        largest=Math.max(largest,cs);
    }
    return largest;
}
}