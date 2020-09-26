package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistConcept {
	public static void main(String[] args) {
		
		LinkedList<String> ls=new LinkedList<String>();
		ls.add("a");
		ls.add("b");
		
		System.out.println(ls);
		ls.addFirst("java");
		ls.addLast("selenium");
		
		System.out.println(ls.get(0));
		ls.set(0, "automation");
		System.out.println(ls);
		System.out.println("*********");
		Iterator<String>itr=ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("size:"+ls.size());
		int num=0;
		while(ls.size()>num) {
			System.out.println(ls.get(num));
			num++;
		}
	}

}
