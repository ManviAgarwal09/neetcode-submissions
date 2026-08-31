class MedianFinder {
PriorityQueue<Integer>maxHeap;
PriorityQueue<Integer>minHeap;
    public MedianFinder() {
        minHeap=new PriorityQueue<>();
        maxHeap=new PriorityQueue<>(Collections.reverseOrder());

    }
    
    public void addNum(int num) {
    maxHeap.offer(num);
    if(!minHeap.isEmpty()&&
    maxHeap.peek()>minHeap.peek()){
        minHeap.offer(maxHeap.poll());
    }
    if(maxHeap.size()>minHeap.size()+1){
        minHeap.offer(maxHeap.poll());
    }
    if(minHeap.size()>maxHeap.size())
{
    maxHeap.offer(minHeap.poll());
} 
    }   
    public double findMedian() {
    if(maxHeap.size()>minHeap.size()){
    return maxHeap.peek();
            }
     return( maxHeap.peek()+minHeap.peek())/2.0;
       
    }
}
