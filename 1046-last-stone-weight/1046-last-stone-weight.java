class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
      for(int i=0;i<stones.length;i++){
        pq.add(stones[i]);
      }
       while(pq.size()>1){
        int x=pq.remove();
        int y=pq.remove();
        int z=Math.abs(y-x);
        if(z!=0) pq.add(z);
       }
     return pq.isEmpty() ? 0 : pq.remove();
    }
}