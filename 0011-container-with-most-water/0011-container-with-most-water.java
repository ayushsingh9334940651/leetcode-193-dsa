class Solution {
    public int maxArea(int[] height) {
     int maxwater=Integer.MIN_VALUE;
     int i=0;
     int j=height.length-1;
     while(i<j){
      int width=j-i;
      int minheight=Math.min(height[i],height[j]);
      int currentwater=width*minheight;
      maxwater=Math.max(maxwater,currentwater);
     
      if(height[i]<height[j]){
        i++;
      }else{
        j--;
      }

     }
     return maxwater;
    }
}