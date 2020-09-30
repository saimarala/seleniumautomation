package collections;

import org.testng.annotations.Test;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HasTableCocnept {

    //it is similar to hashmap,but it is synchronised
    //store the value on the basis of key-value
    //key-->Object--Hashcode-->value
    //Synchronized--thread safe at a time only one thread can access
    // obvisly sequentail threading
    //performance will be slow
    //one thread completes then second thread will come
    //it contains only unique values
    //no null key and no null values
    @Test
    void testhashTable(){
        Hashtable h1=new Hashtable();
        h1.put(1,"Sai");
        h1.put(2,"Selenium");
        h1.put(3,"java");
        h1.put(3,"java"); //it contains only unique values
       // h1.put(null,"sss");//null pointer exception
       // h1.put(4,null);//null pointer exception

        Hashtable h2=new Hashtable();
        h2= (Hashtable) h1.clone();
        System.out.println("the values from h1 :"+h1);//{3=java, 2=Selenium, 1=Sai}
        System.out.println("the values from h2 :"+h2);
        h1.clear();
        System.out.println("the values from h1 :"+h1);
        System.out.println("the values from h2 :"+h2);
        //contains value
        Hashtable st=new Hashtable();
        st.put("A","Sai");
        st.put("B","Selenium");
        st.put("C","Java");
        if(st.contains("sai"))
            System.out.println("value is found");
        //print all the values from hashtable using enumeration
        Enumeration e= st.elements();
        System.out.println("using enumeration");
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

        System.out.println("using entryset");
        Set s=st.entrySet();
        System.out.println(s);

        Hashtable st1=new Hashtable();
        st1.put("A","Sai");
        st1.put("B","Selenium");
        st1.put("C","Java");
        if(st.equals(st1))
            System.out.println("both are equal");

        //get value from a key
        System.out.println("get value from a key :"+st1.get("A"));
        //get the hash code of hash table
        System.out.println("get value from a key :"+st1.hashCode());



    }

}
