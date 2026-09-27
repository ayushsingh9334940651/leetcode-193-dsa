class Solution {
     private boolean check(int[][] grid,int row,int col, int expvalue,int n){
        if(row<0 ||row>=n || col<0 || col>=n || grid[row][col]!=expvalue) return false;
        if(expvalue==n*n-1) return true;
       
      boolean ans1=check(grid,row-2,col-1,expvalue+1,n);
      boolean ans2=check(grid,row-2,col+1,expvalue+1,n);
      boolean ans3=check(grid,row-1,col-2,expvalue+1,n);
      boolean ans4=check(grid,row+1,col-2,expvalue+1,n);
      boolean ans5=check(grid,row-1,col+2,expvalue+1,n);
      boolean ans6=check(grid,row+1,col+2,expvalue+1,n);
      boolean ans7=check(grid,row+2,col-1,expvalue+1,n);
      boolean ans8=check(grid,row+2,col+1,expvalue+1,n);
      return ans1||ans2||ans3||ans4||ans5||ans6||ans7||ans8;
     }
    public boolean checkValidGrid(int[][] grid) {
        return check(grid,0,0,0,grid.length);
    }
}