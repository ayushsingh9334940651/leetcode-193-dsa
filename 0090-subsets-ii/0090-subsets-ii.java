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
    private void subset(int[] nums,int indx, ArrayList<List<Integer>> res, ArrayList<Integer>curr){
     if(indx>=nums.length) {
        res.add(new ArrayList<>(curr));
        return;
     }
     curr.add(nums[indx]);
     subset(nums,indx+1,res,curr);
     curr.remove(curr.size()-1);
     while(indx+1<nums.length && nums[indx]==nums[indx+1]) indx++;
     subset(nums,indx+1,res,curr);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      ArrayList<List<Integer>> res=new ArrayList<>();
     mergesort(nums,0,nums.length-1);
     subset(nums,0,res,new ArrayList());
     return res;
    }
}