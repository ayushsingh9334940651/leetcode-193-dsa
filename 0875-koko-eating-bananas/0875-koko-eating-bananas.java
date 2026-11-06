class Solution {
    private long check(int []nums,int val){
      long sum=0;
      for(int ele:nums) sum += (ele +(long)val - 1) / val;
      return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
         int max=piles[piles.length-1];
        for(int ele:piles) max=Math.max(max,ele);
         int ans=max;
        int i=1; int j=max;
        while(i<=j){
         int mid=i+(j-i)/2;
         if(check(piles,mid)<=h){
           ans=mid;
           j=mid-1;
         }else i=mid+1;
        }
      return ans;
    }
}