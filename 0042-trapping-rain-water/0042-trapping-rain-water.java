class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int watertrap=0;
        int l=0;int r=n-1;
        int lheight=height[l]; int rheight=height[r];
        while(l<r){
         if(lheight<rheight){
            l++;
            lheight=Math.max(lheight,height[l]);
            watertrap+=lheight-height[l];
         }else{
            r--;
            rheight=Math.max(height[r],rheight);
            watertrap+=rheight-height[r];
         }
        }
     return watertrap;
    }
}