class KthLargest {
private PriorityQueue<Integer>mh=new PriorityQueue<>();
private int k;
    public KthLargest(int k, int[] nums) {
this.k=k;
this.mh=new PriorityQueue<>();
for(int ele:nums){
    mh.offer(ele);
if(mh.size()>k){
    mh.poll();
}
}
}
    
    public int add(int val) {
        mh.offer(val);
        if(mh.size()>k){
            mh.poll();
        }
      return mh.peek();  
    }
}
