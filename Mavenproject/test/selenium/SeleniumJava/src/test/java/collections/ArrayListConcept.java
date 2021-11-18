package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept {

    public static  void main(String[] args) {

        int a[] = new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
       // a[3]=4;//ArrayIndexOutOfBoundsException

        Arrays.stream(a).forEach(System.out::println);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for (int b:a){
            System.out.println(b);
        }


        //default value is 10
        //insertion order is  preserved
        //duplicates elements are allowed
        //null  also preserved

        ArrayList ar = new ArrayList();
        ar.add("UFt");
        ar.add("java");
        ar.add("selenium");
        ar.add(null);
        ar.add(1);

        System.out.println(ar);
        System.out.println("size :" + ar.size());
        System.out.println("using Stream");
        ar.stream().forEach(System.out::println);

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        System.out.println("************");
        System.out.println("specific elemnt :" + ar.get(0));
        ar.add(0, "corejava");
        System.out.println(ar + "specific elemnt :" + ar.get(0));
        ar.remove(0);
        System.out.println("remove 0 :" + ar.get(0));
        ar.set(0, "automation");
        System.out.println("set :" + ar);
        ar.removeAll(ar);
        System.out.println("removeall :" + ar);
        System.out.println("integers");
        List<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(1);
        ar1.add(2);

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("a");
        ar2.add("b");
        ar2.add("c");

        System.out.println("enhanced loop");
        for (String str : ar2) {
            System.out.println(str);
        }

        System.out.println("while loop");
        Iterator<String> itr = ar2.iterator();

        while (itr.hasNext()) {
//			String s=itr.next();
//			System.out.println(s);
            System.out.println(itr.next());
        }

        Employee e1 = new Employee("sai", 33, "QA");
        Employee e2 = new Employee("sailo", 34, "QA");
        Employee e3 = new Employee("loka", 36, "QA");

        ArrayList<Employee> e = new ArrayList<Employee>();
        e.add(e1);
        e.add(e2);
        e.add(e3);

        Iterator<Employee> em = e.iterator();
        while (em.hasNext()) {
            Employee emp = em.next();
            System.out.println(emp.name);
        }

        ArrayList<String> ar4 = new ArrayList<String>();
        ar4.add("g");
        ar4.add("h");
        ar4.add("d");
        ArrayList<String> ar3 = new ArrayList<String>();
        ar3.add("d");
        ar3.add("e");
        ar3.add("f");
        System.out.println("**********");
//		ar3.addAll(ar4);
//		for(int i=0;i<ar3.size();i++) {
//			System.out.println(ar3.get(i));
//		}
        ar3.retainAll(ar4);
        for (int i = 0; i < ar3.size(); i++) {
            System.out.println("retainall:" + ar3.get(i));
        }
    }


}
