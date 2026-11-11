class Solution {
    public int findPeakElement(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int ans=nums.length-1;
        while(i<=j){
          int mid=i+(j-i)/2;
          if(mid==0 || mid==nums.length-1 || nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) {
            if( mid<nums.length-1 && nums[mid]<nums[mid+1]) ans=mid+1;
             else ans=mid;
            break;
          }
          if(nums[mid]<nums[mid+1]) i=mid+1;
          else j=mid-1;
        }
        return ans;
    }
}