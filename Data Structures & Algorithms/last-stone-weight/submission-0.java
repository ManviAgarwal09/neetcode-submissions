class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i:stones){
            pq.offer(i);}
            while(pq.size()>1){
               int m= pq.poll();
               int j=pq.poll();
            
            if(m!=j){
                pq.offer(m-j);
            }
        }
        return pq.size()==0?0:pq.poll();
    }
}
