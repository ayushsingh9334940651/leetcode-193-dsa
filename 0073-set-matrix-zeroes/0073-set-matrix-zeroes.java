class Solution {
    public void setZeroes(int[][] matrix) {
     
        boolean row[]=new boolean[matrix.length];
        boolean col[]=new boolean [matrix[0].length];
       
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              if(matrix[i][j]==0){
                row[i]=true;
                col[j]=true;
              }
            }
        }
         for(int i=0;i<matrix.length;i++){
             if(row[i]==true){
                int l=0;
             while(l<matrix[0].length){
                matrix[i][l++]=0;
             }
            }
            for(int j=0;j<matrix[0].length;j++){
              if(col[j]==true){
                int k=0;
                while(k<matrix.length){
                    matrix[k++][j]=0;
                }
              }
            }
        }  
      }
}