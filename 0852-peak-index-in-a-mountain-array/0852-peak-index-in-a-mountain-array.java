class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ans=-1;
       int i=0; int j=arr.length-1; 
       while(i<j){
        int mid=i+(j-i)/2;
        if(arr[mid]<arr[mid+1]) i=mid+1;
        else {
         ans=mid;
         j=mid;
        }
       }
       return ans;
    }
}