class Solution {
    public int[] getConcatenation(int[] nums) {
     int ans[]=new int[2*(nums.length)];
     int j=0;
     while(j<ans.length){
        for(int ele:nums){
         ans[j++]=ele;
        }
     }
     return ans;
    }
}