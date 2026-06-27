class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int n=matrix.length-1;
         int m=matrix[0].length-1;
         int rstart=0;
        
         while(rstart<=n){
            int mid=rstart+(n-rstart)/2;
          if(target >= matrix[mid][0] && target <= matrix[mid][m]){
                 int start=0;
                 int endcol=m;
             while(start<=endcol){
                 
                int midc=start+(endcol-start)/2;
                if(target==matrix[mid][midc]){
                    return true;
                }else if(target>matrix[mid][midc]){
                    start=midc+1;
                }else{
                    endcol=midc-1;
                }
                
             }
              return false; 
              }
               else if(target>matrix[mid][m]){
                 rstart=mid+1;

               }else{
                  n=mid-1;
               }
         }
         return false;
    }
}