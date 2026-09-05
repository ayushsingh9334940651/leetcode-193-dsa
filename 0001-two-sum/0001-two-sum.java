class Solution {
    public int[] twoSum(int[] nums, int target) {
     int arr[]=new int[2];
     int i=0; int j=i+1;
     while(i<nums.length-1){
      
      long sum=(long) nums[i]+nums[j];
      if(sum==target){
        arr[0]=i; arr[1]=j;
       break;
      }
      else j++;
      if(j==nums.length-1){
       long sum1=(long) nums[i]+nums[j];
      if(sum1==target){
        arr[0]=i; arr[1]=j;
       break;
      }
        i++; j=i+1;
      }
     }
     return  arr;
    }
}