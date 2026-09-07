class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstrow=false;
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                 firstrow=true;
                 break;
            }
        }
        boolean firstcol=false;
        for(int j=0;j<matrix.length;j++){
            if(matrix[j][0]==0){
                 firstcol=true;
                 break;
            }
        }
      for(int i=1;i<matrix.length;i++){
         for(int j=1;j<matrix[0].length;j++){
          if(matrix[i][j]==0){
            matrix[i][0]=0;
            matrix[0][j]=0;
          }   

         }
        }
     for(int i=1;i<matrix.length;i++){
        if(matrix[i][0]==0){
         for(int j=1;j<matrix[0].length;j++){
            matrix[i][j]=0;
         }
        }
     }
     for(int j=1;j<matrix[0].length;j++){
        if(matrix[0][j]==0){
            for(int i=1;i<matrix.length;i++){
                matrix[i][j]=0;
            }
        }
     }
     if(firstrow==true){
        for(int j=0;j<matrix[0].length;j++){
         matrix[0][j]=0;
       }
     }
     if(firstcol==true){
        for(int i=0;i<matrix.length;i++){
            matrix[i][0]=0;
        }
     }
    }
}