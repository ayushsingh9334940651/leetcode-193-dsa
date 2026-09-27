class Solution {
    private void merge(int []nums,int low,int mid,int high){
        int i=low; int j=mid+1;
      int temp[]=new int[high-low+1];
      int k =0;
     while(i<=mid && j<=high){
     if(nums[i]<=nums[j] ) temp[k++]=nums[i++];
     else temp[k++]=nums[j++];
     }
     while(i<=mid){
    temp[k++]=nums[i++];

     }
     while(j<=high){
     temp[k++]=nums[j++];
     }
     for(int v=0;v<temp.length;v++){
      nums[low+v]=temp[v];
     }
    }
    private void mergesort(int []nums,int low,int high){
     if(low>=high) return;
     int mid=low+(high-low)/2;
     mergesort(nums,low,mid);;
     mergesort(nums,mid+1,high);
     merge(nums,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
       mergesort(nums,0,nums.length-1);
       return nums; 
    }
}