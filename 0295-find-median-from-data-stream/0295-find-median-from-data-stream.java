class MedianFinder {
     private  PriorityQueue<Integer> min=new PriorityQueue<>();
     private  PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    
    public void addNum(int ele) {
     if(max.isEmpty()){
     max.add(ele);
     return;
     }
     if(ele<max.peek()) max.add(ele);
     else min.add(ele);
     if(max.size()==min.size()+2) min.add(max.remove());
     if(max.size()+2==min.size()) max.add(min.remove());
  
    }
    
    public double findMedian() {
       if(max.isEmpty()) return 0;
       if(max.size()==min.size()+1) return  max.peek();
       if(max.size()+1==min.size()) return min.peek();
       return ((max.peek()+min.peek())/2.0);
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */