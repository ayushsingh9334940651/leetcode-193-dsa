class Solution {
    public int[][] merge(int[][] arr) {
       Arrays.sort(arr,(a,b)->a[0]-b[0]);
       int start=arr[0][0];
       int end=arr[0][1];
       List<int[]> ans=new ArrayList<>();
       for(int i=1;i<arr.length;i++){
        int s=arr[i][0];
        int e=arr[i][1];
        if(s<=end){
            end=Math.max(e,end);
        }
        else{
        ans.add(new int[]{start,end});
        start=s;
        end=e;
        }
       }
       ans.add(new int[]{start,end});
       return ans.toArray(new int[ans.size()][]);
    }
}