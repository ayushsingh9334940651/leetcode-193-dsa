class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int right[]=new int [nums.length];
        int left[]=new int [nums.length];
        int ans[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        int count=0;
         for(int k=i+1;k<nums.length;k++){
            if(nums[i]>nums[k]) count++;
         }
         left[i]=count;
       } 
        for(int i=nums.length-1;i>=0;i--){
        int count=0;
         for(int k=i-1;k>=0;k--){
            if(nums[i]>nums[k]) count++;
         }
         right[i]=count;
       } 
       for(int i=0;i<ans.length;i++){
        ans[i]=right[i]+left[i];
       }
       return ans;
    }
}