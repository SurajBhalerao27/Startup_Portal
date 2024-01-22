package collections;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	
    public static void main(String[] args) {
        /*
         * PriorityQueue class implements Queue interface.
         * 
         * Properties:-
         * 1) It does not follow FIFO, by default the member having least priority will be
         *    deleted first.
         * 2) NUll values are not allowed. Because priorityQueue is all about giving priority 
         *    to least valued member, as null value don't have any value so it cannot 
         *    prioritize the null value.
         * 3) Insertion order is not maintained.
         * 4) Members are not sorted.
         * 5) Duplicates are allowed.
         * 6) Only those classes which have implemented Comparable can be added to PriorityQueue.
         *    otherwise we will have to use comparator.
         */

         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
         pq.add(1040);
         pq.add(24);
         pq.add(6);
         pq.add(117);
         pq.add(35);
         // pq.add(null); :- null values are not allowed. This will give NullPointerException.
         pq.add(17);
         
         System.out.println(pq);

         pq.poll();

         System.out.println("\nAfter:\n"+pq);
    }
    
}
