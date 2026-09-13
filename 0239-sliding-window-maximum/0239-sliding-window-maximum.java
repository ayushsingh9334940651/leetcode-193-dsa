class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
     int ans[]=new int[nums.length-k+1];
     int j=0;
      ArrayDeque <Integer>dq=new ArrayDeque<>();
       dq.add(0);
      for(int i=1;i<k;i++){
       int num=nums[i];
       while(!dq.isEmpty() && num>nums[dq.getLast()]) dq.removeLast();
       dq.add(i);
      }
      ans[j++]=nums[dq.peekFirst()];
      for(int i=k;i<nums.length;i++){
        int num=nums[i];
        while(!dq.isEmpty() && (dq.peekFirst()<i-k+1)) dq.removeFirst(); 
        while(!dq.isEmpty() && num>nums[dq.getLast()]) dq.removeLast();
        dq.add(i);
        ans[j++]=nums[dq.peekFirst()];
      }
      return ans; 
    }
}