package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistConcept {
    public static void main(String[] args) {
    //default value is 10
        //insertion order is  preserved
        //duplicates elements are allowed
        //null valuse also prserved
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.add("d");
        System.out.println(ls);

        //remove
       // ls.remove();

        System.out.println(ls.get(0));
        //Insert/adding element in the middle of linked List
        ls.add(4,"selenium java");
        System.out.println("After inserting element : "+ls);
        //change the value
        ls.set(0, "automation");
        System.out.println("After change element : "+ls);
        //reterving the vale/object
        ls.get(3);
        System.out.println("Reterving specific value :"+ls);
        //contains
        System.out.println(ls.contains("automation"));
        System.out.println(ls.isEmpty());
        System.out.println("*********");
        Iterator<String> itr = ls.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("size:" + ls.size());
        int num = 0;
        while (ls.size() > num) {
            System.out.println(ls.get(num));
            num++;
        }
        LinkedList ls1=new LinkedList<> ();
        ls1.add("x");
        ls1.add("y");
        ls1.add("A");
        ls1.add("K");
        ls1.add("c");
        ls1.addAll(ls);
        System.out.println(ls1);
        ls1.removeAll(ls);
        System.out.println(ls1);

        Collections.sort(ls1);
        Collections.sort(ls1,Collections.reverseOrder());
        //Shuffle
        Collections.shuffle(ls1);

        //Specfic for Linked List
        ls.addFirst("java");
        ls.addLast("selenium");
        System.out.println(ls.getFirst());
        System.out.println(ls.getLast());
        System.out.println(ls.removeFirst());
        System.out.println(ls.removeLast());

    }

}
