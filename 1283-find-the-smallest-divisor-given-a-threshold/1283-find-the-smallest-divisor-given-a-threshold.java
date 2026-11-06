class Solution {
    private int check(int []nums,int val){
      int sum=0;
      for(int ele:nums) sum +=(ele + val -1)/val;
      return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=nums[nums.length-1];
        for(int ele:nums) max=Math.max(max,ele);
        int ans=max;
        int i=1; int j=max;
        while(i<=j){
         int mid=i+(j-i)/2;
         if(check(nums,mid)<=threshold){
           ans=mid;
           j=mid-1;
         }else i=mid+1;
        }
      return ans;
    }
}