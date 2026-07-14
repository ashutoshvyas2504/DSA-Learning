class Solution {
    public int lastStoneWeight(int[] stones) {
        // Max Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int ele : stones){ // ading element of array to pq
            pq.add(ele);
        }
        while(pq.size()>1){
            int max = pq.remove();// removing max value 
            int smax = pq.remove();// removing max value that will become 2nd max of the Queue

            int nstone = max - smax;
            if(nstone!=0){
                pq.add(nstone);
            }
        }
         if(pq.size()==0){
             return 0;
         } else {
            return pq.remove();// return remaining value in pq
         }
    }
}