class Solution {
    public void moveZeroes(int[] nums) {
       int i=0;
       for(int ele:nums){
        if(ele!=0){
            nums[i++]=ele;
        }
       }
       for(int j=i;j<nums.length;j++){
        nums[j]=0;
       }
    }
}