package MyPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

    public static void main(String[] args) {

        //dyanmic array
        //can contain duplicate values/elements
        //maintain inseration order
        //synchronized
        //allows random access to fetch the element because it stores the values on basis of index
        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        System.out.println(ar.size());
        ar.add(40);
        ar.add(40);
        ar.add(50);
        ar.add(12.553);
        ar.add("selenium");
        System.out.println(ar.size());
        System.out.println(ar.get(3));

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        //non generics vs generics

        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(3000);

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("selenium");

        Employee e1 = new Employee("selenium", 23, "QA");
        Employee e2 = new Employee("java", 23, "tester");
        Employee e3 = new Employee("testng", 23, "testing");

        ArrayList<Employee> ar3 = new ArrayList<Employee>();
        ar3.add(e1);
        ar3.add(e2);
        ar3.add(e3);

        Iterator<Employee> it = ar3.iterator();

        while (it.hasNext()) {
            Employee emp = it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }
        //add all
        ArrayList<String> ar4 = new ArrayList<String>();
        ar4.add("selenium");
        ar4.add("automation");
        ar4.add("testing");

        ArrayList<String> ar5 = new ArrayList<String>();
        ar5.add("UFT");
        ar5.add("automation");
        ar5.add("testing");
        ar4.addAll(ar5);

        for (int i = 0; i < ar4.size(); i++) {
            System.out.println(ar4.get(i));
        }
        //remove all
        ar4.removeAll(ar5);
        for (int i = 0; i < ar4.size(); i++) {
            System.out.println(ar4.get(i));
        }

        //retain all
        System.out.println("retainall*****");
        ArrayList<String> ar6 = new ArrayList<String>();
        ar6.add("selenium1");
        ar6.add("automation2");
        ar6.add("testing3");

        ArrayList<String> ar7 = new ArrayList<String>();
        ar7.add("UFT");
        ar7.add("automation2");
        ar7.add("testing3");
        ar7.addAll(ar5);
        ar6.retainAll(ar7);
        for (int i = 0; i < ar4.size(); i++) {
            System.out.println(ar6.get(i));
        }

    }


}
