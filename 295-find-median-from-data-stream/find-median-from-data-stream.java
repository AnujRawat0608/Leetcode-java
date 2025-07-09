class MedianFinder {
    PriorityQueue<Integer> leftmaxheap; // maxheap
    PriorityQueue<Integer> rightmixheap; // minheap

    public MedianFinder() {

        leftmaxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
        rightmixheap = new PriorityQueue<Integer>();
        
    }
    
    public void addNum(int num) {
       if(leftmaxheap.isEmpty() || num < leftmaxheap.peek()){
        leftmaxheap.add(num);
       } else{
        rightmixheap.add(num);
       }

    if(Math.abs(leftmaxheap.size() - rightmixheap.size()) > 1){
        rightmixheap.add(leftmaxheap.poll());
    }else if (leftmaxheap.size() < rightmixheap.size()){
        leftmaxheap.add(rightmixheap.poll());

    }
}
     public double findMedian() {
        if (leftmaxheap.size() == rightmixheap.size()) {
            // even number of elements
            return (double) (leftmaxheap.peek() + rightmixheap.peek()) / 2;
        }

        // odd number of elements
        return leftmaxheap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */