package collections;

import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class PriorityQueueConcept {
    @Test
    void testPriority() {
        PriorityQueue pq=new PriorityQueue();
//        pq.add("A");
//        pq.add("B");
//        pq.add("C");
//        pq.offer("C");
        System.out.println(pq);//[A, B, C, C]
        //get head element
       // System.out.println(pq.element());//A returns head element ,if empty returns NoSuchElementException

        System.out.println(pq.peek());//A Returns Head element ,if empty returns null



    }
}
