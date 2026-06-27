class Solution {
    public int trap(int[] height) {
        
        int trappedWater=0;
        int n=height.length; 
        int rightmax=0;
        int leftmax=0;
        int i=0;
        int j=n-1;
        while(i<=j){
         rightmax=Math.max(rightmax,height[j]);
         leftmax=Math.max(leftmax,height[i]);
         if(rightmax>leftmax){
            trappedWater+=leftmax-height[i++];
    
         }else{
            trappedWater+=rightmax-height[j--];
         }
        }
         return trappedWater;
    }
}