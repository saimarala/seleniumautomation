package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> h1=new Hashtable<Integer,String>();
		
		h1.put(1, "java");
		h1.put(2, "selenium");
		
		Hashtable<Integer,String> h2=new Hashtable<Integer,String>();
		h2=(Hashtable<Integer, String>) h1.clone();
		System.out.println(h1);
		h1.clear();
		System.out.println(h1);
		System.out.println(h2);
		Set s=h2.entrySet();
		System.out.println("entry:"+s);
		
		Enumeration<String> e=h2.elements();
		System.out.println("enum");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("entry set");
		for(Entry en:h2.entrySet()) {
			System.out.println(en.getKey()+" "+en.getValue());
		}

	}

}
