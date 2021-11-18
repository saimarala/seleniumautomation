package collections;


import org.testng.annotations.Test;

import java.util.HashSet;

public class HashSetConcept {
    @Test
    void testHashSet() {
        //default capacity is 16 and  load factor 0.75
        // HashSet hs=new HashSet(100);//initial capacity is 100
        //Duplicates are not allowed
        //hash table data structure
       // Insertion order not preserved
        //elements will be inserted in hashcode 
        // HashSet hs=new HashSet(100, (float) 0.90);
        HashSet hs = new HashSet();//default capacity is 16 and  load factor 0.75
        hs.add("welcome");
        hs.add(16.4);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        hs.add('a');
        hs.add("Exit");
        System.out.println(hs);//Insertion order is not preserved
        // [null, A, 16.4, welcome, true, Exit]
        //remove
        hs.remove(16.4);
        System.out.println("After removing element :" + hs);//[null, A, welcome, true, Exit]
        //contains
        System.out.println(hs.contains("welcome"));
        System.out.println(hs.contains("abc"));
        //reading objects/elements  from hashset mutlipe ways
//            for(int i=0;i< hs.size();i++){
//                System.out.println(hs);
//            }
        //for (Object e:hs)System.out.println(e);
//        Iterator it=hs.iterator();
//        while (it.hasNext())System.out.println(it.next());
        // hs.forEach(System.out::println);
        hs.stream().forEach(System.out::println);
        hs.forEach(System.out::println);

        HashSet<Integer> evenNum = new HashSet<Integer>();
        evenNum.add(2);
        evenNum.add(4);
        evenNum.add(6);
        System.out.println("HashSet :" + evenNum);//[2, 4, 6]
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.addAll(evenNum);
        numbers.add(10);
        System.out.println("new HashSet :" + numbers);//[2, 4, 6, 10]
        //removeAll
        numbers.removeAll(evenNum);
        System.out.println("after removing:"+numbers);//[10]
    }
    @Test
    void HashSetdemo(){
        HashSet<Integer> set1=new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("Hashset 1:"+set1);//[1, 2, 3, 4, 5]

        HashSet<Integer> set2=new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Hashset 1:"+set2);//[3, 4, 5]
//        //Union
//        set1.addAll(set2);
//        System.out.println("Union :"+set1);//[1, 2, 3, 4, 5]
//        //intersection
        set1.retainAll(set2);
        System.out.println("Intersections :"+set1);//[3, 4, 5]
        //difference
//            set1.removeAll(set2);
//            System.out.println("difference"+set1);//[1, 2]
            //subset
       // System.out.println(set1.containsAll(set2));//true
    }
}
