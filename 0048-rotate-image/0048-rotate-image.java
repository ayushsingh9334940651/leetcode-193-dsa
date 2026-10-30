class Solution {
    public void rotate(int[][] matrix) {
        int ans[][]=new int[matrix.length][matrix[0].length];
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=0;j<matrix[0].length;j++){
              ans[j][matrix.length-i-1]=matrix[i][j];
            }
        }
         for(int i=matrix.length-1;i>=0;i--){
            for(int j=0;j<matrix[0].length;j++){
              matrix[i][j]=ans[i][j];
            }
        }
    }
}