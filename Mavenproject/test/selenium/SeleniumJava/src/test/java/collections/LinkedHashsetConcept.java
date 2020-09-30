package collections;

import org.testng.annotations.Test;

import java.util.LinkedHashSet;

public class LinkedHashsetConcept {
    //Duplicates are not allowed
    //Insertion order preserved
    //Hastable+linkedlist data structure
    //default capacity is 16 and  load factor 0.75
    @Test
    void testLinkedhashset(){
        LinkedHashSet lhset=new LinkedHashSet();
        lhset.add(100);
        lhset.add(500);
        lhset.add(300);
        lhset.add(200);
        lhset.add(100);
        lhset.forEach(System.out::println);



    }
}
