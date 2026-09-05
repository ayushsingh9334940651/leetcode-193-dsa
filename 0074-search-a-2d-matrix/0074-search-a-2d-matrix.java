class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;int lastrow=matrix.length-1;
        int col=0;int lastcol=matrix[0].length-1;
        while(row<=lastrow){
            int mid=row+(lastrow-row)/2;
            if(matrix[mid][0]>target) lastrow=mid-1;
            else if(matrix[mid][lastcol]<target) row=mid+1;
            else{
             while(col<=lastcol){
                int middle=col+(lastcol-col)/2;
                if(matrix[mid][middle]<target) col=middle+1;
                else if(matrix[mid][middle]>target) lastcol=middle-1;
                else return true;
             }
             }
         }
    return false;
    }
}