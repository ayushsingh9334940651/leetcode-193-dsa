class Solution {
    public int[][] merge(int[][] arr) {
     Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
      ArrayList<List<Integer>> result=new ArrayList<>();
      int start=arr[0][0];
      int end=arr[0][1];
      for(int i=1;i<arr.length;i++){
        int s=arr[i][0];
        int e=arr[i][1];
        if(s<=end){
            end=Math.max(e,end);
        }
        else{
            result.add(Arrays.asList(start,end));
            start=s;
            end=e;
        }
      }
      result.add(Arrays.asList(start,end));
     int[][] ans = new int[result.size()][2];

     for(int i = 0; i < result.size(); i++){
     ans[i][0] = result.get(i).get(0);
     ans[i][1] = result.get(i).get(1);
     }
     return ans;
    }
}