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
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        mergesort(nums,0,n-1);
        ArrayList<Integer> ans= new ArrayList<>();
        int max=1;
       for(int i=1;i<nums.length;i++){
          if(nums[i]==nums[i-1]) max++;
          else{
            if(n/3<max){
            ans.add(nums[i-1]);
           }
           max=1;   
          }
       }
       if(n/3<max) ans.add(nums[n-1]);
       return ans;
    }
}