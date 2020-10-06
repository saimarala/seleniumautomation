package collections;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {
    @Test
    void tesHashap() {
        //HashMap is a class implements Map Interface
        //it contains only unique element
        //stores the valuse in (key and value )pair
        //it may have one null key and multiple null values
        //it maintains no order
        //hashmap is non-synchronised -- not thread safe
        //if it is used in multi thread env/concepts
        //more than one thread access procces hashmap the simultanosly
        //hashmap access all the threads
        //performance hashmap will be increase
        //concurent modification exception--fail-fast condition
//******************
        //Non-synchronized
        //multiple thread alloed
        //Not thread safe
        //performance fast
        //one null key and multiple null values

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "java");
        hm.put(2, "selenium");
        hm.put(3, "autoamtion");
        hm.put(4, "UFT");
        hm.put(null, "UFT");
        hm.put(null, "UFT");

       // System.out.println(hm.get(null));
        System.out.println(hm.get(8));//null
        System.out.println(hm.get(5));//null:UFT
        System.out.println(hm.get(null));

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());

        }
        hm.remove(4);
        System.out.println(hm);
        System.out.println("***********");
        HashMap<Integer, Employee> e = new HashMap<Integer, Employee>();
        Employee e1 = new Employee("sai", 22, "QA");
        Employee e2 = new Employee("sailo", 32, "QA");
        e.put(1, e1);
        e.put(2, e2);
        //travse the hashmap
        for (Entry<Integer, Employee> m1 : e.entrySet()) {
            int key = m1.getKey();
            Employee emp = m1.getValue();
            System.out.println("Employee " + key + " info");

            System.out.println(emp.name + " " + emp.age + " " + emp.dept);

        }
        System.out.println("***entrySet***");
        Set s = hm.entrySet();
        System.out.println(s);//[1=java, 2=selenium, 3=autoamtion]
        if (hm.containsValue("java"))
            System.out.println("value is found");
        System.out.println(hm);//{1=java, 2=selenium, 3=autoamtion}

        System.out.println("***keySet***");

        Set s1 = hm.keySet();
        System.out.println(s1);//[1, 2, 3]
        for (Object ks : hm.keySet()) {
            System.out.println(ks);

        }
    }

}
