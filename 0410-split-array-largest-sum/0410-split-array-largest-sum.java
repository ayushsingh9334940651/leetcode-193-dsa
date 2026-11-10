class Solution {
     private  boolean verify(int []nums,int k,int check){
      int count=1; int p=0;
      for(int ele:nums){
        if(p+ele>check){
         count++;
         p=ele;
          if (count >k) return false;
        }else p+=ele;
      }
     return true;
    } 
    public int splitArray(int[] nums, int k) {
     int i=0;
     int j=0;
     for(int ele:nums){
        i=Math.max(i,ele);
        j+=ele;
     }
     int ans=j;
     while(i<=j){
      int mid=i+(j-i)/2;
      if(verify(nums,k,mid)){
        ans=mid;
        j=mid-1;
      }else i=mid+1;
     }
     return ans;
    }
}