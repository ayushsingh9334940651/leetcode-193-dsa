class Solution {
    private boolean wexist(char[][] board,int i,int j, String word,int indx){
     if(i<0 || i>board.length-1 || j<0 || j>board[0].length-1 || board[i][j]=='*' || board[i][j]!=word.charAt(indx)) return false;
     if(indx==word.length()-1) return true;
     char ch=board[i][j];
     board[i][j]='*';
      boolean res=wexist(board,i-1,j,word,indx+1)||wexist(board,i+1,j,word,indx+1)||wexist(board,i,j-1,word,indx+1)||
      wexist(board,i,j+1,word,indx+1);
      board[i][j]=ch;
      return res;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0) && wexist(board,i,j,word,0)){
                 return true;
                }
            }
        }
        
     return false;
    }
}