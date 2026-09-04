class Solution {
    public int firstStableIndex(int[] nums, int k) {
     if(nums.length==1 && k>=0) return 0;
     int n=nums.length;
     int pre[]=new int[n];
     int min=nums[n-1];
     for(int i=n-1;i>=0;i--){
     if(nums[i]<min) min=nums[i];
     pre[i]=Math.min(min,nums[i]);
     }
     int max=Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
     max=Math.max(max,nums[i]);
     if(max-pre[i]<=k) return i;
     }
     return -1;
    }
}