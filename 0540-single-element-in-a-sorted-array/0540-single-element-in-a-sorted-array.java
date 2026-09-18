class Solution {
    public int singleNonDuplicate(int[] nums) {
     int n=nums.length;
     int i=0; int j=n-1;
     int ans=0;
     while(i<=j){
        int mid=i+(j-i)/2;
         if(mid==0)   return nums[0];
         if(mid==n-1) return nums[n-1];
        if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) {
             ans=nums[mid];
             break;
             }

        if(nums[mid]==nums[mid-1]){
            if(mid%2==0)  j=mid-1;
            else i=mid+1;
        }else{
            if(mid%2==0) i=mid+1;
            else j=mid-1;
        }

     }
     return ans;
    }
}