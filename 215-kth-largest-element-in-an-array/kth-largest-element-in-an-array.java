class Solution {
    public int findKthLargest(int[] nums, int k) {

        //Min heap to store the k largest element 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //iterate through the array
        for(int val : nums){
            //add current element to  the min heap
            pq.add(val);
            //if heap exceed size k  remove the smallest element
            if(pq.size() > k)pq.poll();
        }
        return pq.peek();
        
    }
}