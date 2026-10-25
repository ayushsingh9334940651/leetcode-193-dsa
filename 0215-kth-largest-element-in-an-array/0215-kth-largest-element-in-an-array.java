class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> minHeap = new PriorityQueue<>();
      for(int ele:nums){
        minHeap.add(ele);
        if(minHeap.size()>k) minHeap.remove();
      }
      return minHeap.peek();
    }
}