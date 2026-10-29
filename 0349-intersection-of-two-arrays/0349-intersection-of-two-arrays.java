class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      boolean arr[]=new boolean[1001];
      boolean common[]=new boolean[1001];
      for(int ele:nums1){
        arr[ele]=true;
      }
      int i=0;
      for(int ele:nums2){
        if(arr[ele]){
          i++;
          arr[ele]=false;
          common[ele]=true;
        } 
      }
      int ans[]=new int[i];
      int j=0;
      for(int ele:nums2){
        if(common[ele]){
             ans[j++]=ele; 
             common[ele]=false;
      }
    }
    return ans;
    }
}