class Solution {
    private boolean issafe(char [][]board,int row,int col,char digit){
      for(int i=0;i<9;i++){
       if(board[i][col]==digit) return false;
      }
      for(int j=0;j<9;j++){
        if(board[row][j]==digit) return false;
      }
      int sr=(row/3)*3;
      int sc=(col/3)*3;
      for(int i=sr;i<sr+3;i++){
        for(int j=sc;j<sc+3;j++){
            if(board[i][j]==digit) return false;
        }
      }
      return true;
    }
    private boolean sodoku(char [][]board,int row,int col){
     if(row==9){
        return true;
     }
     int nextrow=row;int nextcol=col+1;
     if(col+1==9){
        nextrow=row+1;
        nextcol=0;
     }
     if(board[row][col]!='.'){
        return sodoku(board,nextrow,nextcol);
     
     }
     for(int digit=1;digit<=9;digit++){
      char ch = (char)(digit + '0');
      if(issafe(board,row,col,ch)){
        board[row][col]=ch;
        if(sodoku(board,nextrow,nextcol)) return true;
         board[row][col] = '.';  
      }
     }
     return false;
    }
    public void solveSudoku(char[][] board) {
      sodoku(board,0,0);
    }
}