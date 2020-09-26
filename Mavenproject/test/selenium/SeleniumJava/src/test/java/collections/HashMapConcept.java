package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "java");
        hm.put(2, "selenium");
        hm.put(3, "autoamtion");
        System.out.println(hm.get(1));

        for (Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());

        }
        System.out.println("***********");
        HashMap<Integer, Employee> e = new HashMap<Integer, Employee>();
        Employee e1 = new Employee("sai", 22, "QA");
        Employee e2 = new Employee("sailo", 32, "QA");
        e.put(1, e1);
        e.put(2, e2);
        for (Entry<Integer, Employee> m1 : e.entrySet()) {
            int key = m1.getKey();
            Employee emp = m1.getValue();
            System.out.println(key + "info");

            System.out.println(emp.name + " " + emp.age + " " + emp.dept);

        }
        System.out.println("***entrySet***");
        Set s = hm.entrySet();
        System.out.println(s);
        if (hm.containsValue("java"))
            System.out.println("value is found");
        System.out.println(hm);

        System.out.println("***keySet***");

//			Set s1=hm.keySet();
//			System.out.println(s1);
//			for(String ks:hm.keySet()) {
//				
//			}
    }

}
