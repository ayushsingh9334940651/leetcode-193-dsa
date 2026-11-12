class Solution {
    private int maxindex(int [][] mat,int row,int mid){
       int index =-1;
       int max=-1;
       for(int i=0;i<=row;i++){
        if(max<mat[i][mid]){
            max=mat[i][mid];
            index=i;
        }
       } 
      return index;
    }
    public int[] findPeakGrid(int[][] mat) {
     int ans[]=new int[2];
     int n=mat.length-1;
     int m=mat[0].length-1;
     int i=0;int j=m;
     while(i<=j){
        int mid=i+(j-i)/2;
        int maxindex=maxindex(mat,n,mid);
        int left=mid-1>=0? mat[maxindex][mid-1]:-1;
        int right=mid+1<=m? mat[maxindex][mid+1]:-1;
        if(mat[maxindex][mid]>left && mat[maxindex][mid]>right){
           ans[0]=maxindex;ans[1]=mid;
           break;
        }
        else if(mat[maxindex][mid]<left) j=mid-1;
        else i=mid+1;
     }
     return ans;
    }
}