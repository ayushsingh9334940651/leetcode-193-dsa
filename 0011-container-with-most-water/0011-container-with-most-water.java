class Solution {
    public int maxArea(int[] height) {
     int maxwater=Integer.MIN_VALUE;
     int i=0;
     int j=height.length-1;
     while(i<j){
      int high=Math.min(height[i],height[j]);
      int di=j-i;
      maxwater=Math.max(maxwater,high*di);
      if(height[i]<height[j]) i++;
      else j--;
     }
     return maxwater;
    }
}