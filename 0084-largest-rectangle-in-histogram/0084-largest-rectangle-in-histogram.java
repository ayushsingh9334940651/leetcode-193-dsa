class Solution {
    private void presmaller(int [] height,int []presm){
        Stack<Integer> st=new Stack<>();
     for(int i=0;i<presm.length;i++){
        while(!st.isEmpty() && height[st.peek()]>=height[i]) st.pop();
        if(st.isEmpty()) presm[i]=-1;
        else presm[i]=st.peek();
        st.push(i);
     }
    }
    private void nextsmaller(int []height, int [] nextsm){
        int n=height.length;
      Stack<Integer> st=new Stack<>();
      for(int i=height.length-1;i>=0;i--){
        while(!st.isEmpty() && height[st.peek()]>=height[i]) st.pop();
        if(st.isEmpty()) nextsm[i]=n;
        else nextsm[i]=st.peek();
        st.push(i);
    }
    }
    public int largestRectangleArea(int[] heights) {
     int max=0;
     int n=heights.length;

     int presm[]=new int[n];
     presmaller(heights,presm);
     int nextsm[]=new int[n];
     nextsmaller(heights,nextsm);
     for(int i=0;i<n;i++){
        max=Math.max(max,(nextsm[i]-presm[i]-1)*(heights[i]));
     }
    return max;

    }
}