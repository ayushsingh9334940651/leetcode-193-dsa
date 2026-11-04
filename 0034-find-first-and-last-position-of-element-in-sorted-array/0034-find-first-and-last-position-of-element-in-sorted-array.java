class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int i=0;
        int j=nums.length-1;
        int check=nums.length;
        while(i<=j){
            int mid=i+(j-i)/2;
         if(nums[mid]>=target){
            check=mid;
            j=mid-1;
         }else i=mid+1;
        } 
    if(check<nums.length && nums[check]!=target || nums.length==0 || check==nums.length) return ans;
     ans[0]=check;
    i=0;j=nums.length-1;
    check=nums.length;
    while(i<=j){
        int mid=i+(j-i)/2;
        if(nums[mid]<=target){
            check=mid;
            i=mid+1;
        }else j=mid-1;
    }
     ans[1]=check;
     return ans;
    }
}