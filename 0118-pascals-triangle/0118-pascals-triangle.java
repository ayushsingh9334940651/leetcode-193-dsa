class Solution {
    private int  Ncr(int n, int r) {
        int ans = 1;

        for (int i = 1; i <= r; i++) {
            ans = ans * (n - i + 1) / i;
        }

        return ans;
    }
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
         ArrayList<Integer> help=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
           for(int j=0;j<i;j++){
            if(j==0 || j==i-1) help.add(1);
              else  help.add(Ncr(i-1,j));
           }
          ans.add(help);
          help=new ArrayList<>();
        }
        return ans;
    }
}