class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr= new ArrayList<>();
      int startrow=0, startcol=0,endrow=matrix.length-1, endcol=matrix[0].length-1;
       while(startrow<=endrow && startcol<=endcol){
        for(int j=startcol;j<=endcol;j++){
            arr.add(matrix[startrow][j]);
        }
        if(startrow<endrow ){
        for(int i=startrow+1;i<=endrow;i++ ){
            
            arr.add(matrix[i][endcol]);
        }}
        if(startrow<endrow && startcol < endcol ){
        for(int j=endcol-1;j>=startcol;j--){
            
            arr.add(matrix[endrow][j]);
        }}
        if (startrow < endrow && startcol < endcol){
        for(int i=endrow-1;i>startrow;i--){
            arr.add(matrix[i][startcol]);
        }}
        startrow++;
        startcol++;
        endcol--;
        endrow--;
       }
       return arr;
    }
}