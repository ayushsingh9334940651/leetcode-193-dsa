class Solution {
    static List<List<String>> ans = new ArrayList<>();

    public static boolean check(char arr[][],int index,int col){
     for(int i=index-1;i>=0;i--){
        if(arr[i][col]=='Q'){
           return false;
        }
     }
     int i=index-1;
     int j=col-1;

     while(i>=0 && j>=0){
        if(arr[i][j]=='Q'){
            return false;
        }
        i--;
        j--;
     }
    
     j=col+1;
     i=index-1;
     while(i>=0 && j<arr.length){
        if(arr[i][j]=='Q'){
            return false;
        }
        i--;
        j++;
     }
     return true;

    }
    public static void nqueen(char n[][],int row){
        if(row==n.length){
           List<String> temp = new ArrayList<>();

            for (int i = 0; i < n.length; i++) {
                temp.add(new String(n[i]));
            }

            ans.add(temp);
            return;
        }
       
        for(int j=0;j<n.length;j++){
            if(check(n,row,j)){
            n[row][j]='Q';
            nqueen(n,row+1);
            n[row][j]='.';
        }
       }

    }
    public static void printarr(char arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public List<List<String>> solveNQueens(int n) {
         ans.clear();

        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        nqueen(arr,0);
      
      return ans;
        
    }
}