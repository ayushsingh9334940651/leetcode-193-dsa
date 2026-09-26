class Solution {
    private boolean check(char n[][],int row,int col){
      for(int i=row-1;i>=0;i--){
        if(n[i][col]=='Q') return false;
      }
      int i=row-1,j=col-1;
      while(i>=0 && j>=0){
        if(n[i][j]=='Q') return false;
        i--;j--;
      }
      i=row-1; j=col+1;
      while(i>=0 && j<n.length){
        if(n[i][j]=='Q') return false;
        i--;j++;
      }
      return true;
    }
    private void nqueen(char n[][],int row,List<List<String>> ans){
     if(row==n.length){
        ArrayList<String> help=new ArrayList<>();
        for(int i=0;i<n.length;i++){
            help.add(new String(n[i]));
        }
        ans.add(help);
        return ;
     }
     for(int j=0;j<n.length;j++){
      if(check(n,row,j)){
       n[row][j]='Q';
       nqueen(n,row+1,ans);
       n[row][j]='.';
      }
      }
    }
    public List<List<String>> solveNQueens(int n) {
      List<List<String>> ans = new ArrayList<>();
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        nqueen(arr,0,ans);
      
      return ans;
        
    }
}