class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length==1 && k>=0) return 0;
        //int ans=-1;
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      for(int ele: nums) pq.add(ele);
      int max=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
       max=Math.max(max,nums[i]);
       if(max-pq.peek()<=k) return i;
       pq.remove(nums[i]);
      }
     return -1;
    }
}