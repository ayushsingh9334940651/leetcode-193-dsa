class Solution {
    private int mergesort(int arr[],int low,int high){
         int count=0;
     if(low>=high) return count;
    
     int mid=low+(high-low)/2;
     count+=mergesort(arr,low,mid);
     count+=mergesort(arr,mid+1,high);
     count+=countpair(arr,low,mid,high);
     merge(arr,low,mid,high);
     return count;
    }
    private int countpair(int arr[],int low,int mid,int high){
        int count=0;
      int right=mid+1;
     for(int i = low; i <= mid; i++){
        while(right <= high && arr[i] > 2L * arr[right]){
            right++;
        }
        count += right - (mid + 1);
    }
      return count;
    }
private void merge(int arr[],int low,int mid,int high){
    int i=low; int j=mid+1;
    int temp[]=new int[high-low+1];
    int k =0;
  while(i<=mid && j<=high){
     if(arr[i]<=arr[j] ) temp[k++]=arr[i++];
     else temp[k++]=arr[j++];
  }
  while(i<=mid){
    temp[k++]=arr[i++];

  }
  while(j<=high){
    temp[k++]=arr[j++];
  }
  for(int v=0;v<temp.length;v++){
    arr[low+v]=temp[v];
  }
}
    public int reversePairs(int[] nums) {
     int low=0;
     int high=nums.length-1;
     return mergesort(nums,low,high);
    }
}