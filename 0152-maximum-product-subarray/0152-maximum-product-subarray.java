class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int pre=1;int suffix=1;
        for(int i=0;i<n;i++){
          if(suffix==0) suffix=1;
          if(pre==0) pre=1;
          pre*=nums[i];
          suffix*=nums[n-i-1];
          max=Math.max(max,Math.max(pre,suffix));
        }
        return max;
    }
}