class Solution {
     public static void arraysort(int arr[],int start, int end){
        int mid=start+(end-start)/2;
        if(start>=end){
            return;
        }
        arraysort(arr, start,mid);
        arraysort(arr, mid+1, end);
        merge(arr,start,mid,end);
    }
    public static void  merge(int arr2[],int start,int mid,int end){
        int i=start,j=mid+1,k=0;
        int temp[]=new int[end-start+1];
        while(i<=mid && j<=end){
           if(arr2[i]<=arr2[j]){
            temp[k++]=arr2[i++];
           }else{
             temp[k++]=arr2[j++];
           }
        }
    while(i<=mid){
        temp[k++]=arr2[i++];
    }
    while(j<=end){
        temp[k++]=arr2[j++];
    }
    for(k=0,i=start;k<temp.length;k++,i++){
        arr2[i]=temp[k];
    }
    }
    public int missingNumber(int[] nums) {
       int ans=nums.length;
       arraysort(nums,0,ans-1);
       for(int i=0;i<nums.length;i++){
         if(nums[i]!=i) return i;
       }
       return ans;
    }
}