class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int i=0;i<queries.length;i++){
           int k=queries[i][2];    int v=queries[i][3];
           int range=queries[i][1];   int start=queries[i][0];
           while(start<=range && start<nums.length){
            nums[start]=(int)(((long)nums[start]*v)%(Math.pow(10,9)+7));
            start+=k;
           }
        }
        int ans=0;
        for(int ele: nums){
            ans^=ele;
        }
        return ans;
    }
}