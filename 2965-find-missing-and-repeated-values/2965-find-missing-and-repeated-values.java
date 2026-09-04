class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
        int n=grid.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             int elem=grid[i][j];
             if(set.contains(elem))ans[0]=elem;
             else set.add(elem);
            }
        }
        int range=n*n;
        for(int i=1;i<=range;i++){
         if(!set.contains(i)) ans[1]=i;
        }
        return ans;
    }
}