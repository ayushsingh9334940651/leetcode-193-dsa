class Solution {
    public int maxProduct(int[] nums) {
        int max=-20;
        for(int i=0;i<nums.length;i++){
            int check=1;
            for(int j=i;j<nums.length;j++){
              check *= nums[j];
              max = Math.max(max, check);
            }
        }
        return max;
    }
}