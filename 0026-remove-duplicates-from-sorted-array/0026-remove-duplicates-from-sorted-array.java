class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int i=1;
    while(i<nums.length){
       if(nums[i]!=nums[k]) nums[++k]=nums[i];
       i++;
    }
    return k+1;
    }
}