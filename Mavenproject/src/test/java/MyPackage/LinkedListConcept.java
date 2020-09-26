package MyPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("selenium");
		ll.add("UFT");
		ll.add("testing");
		
		System.out.println(ll);
		ll.addFirst("sai");
		ll.addLast("automation");
		//add
		System.out.println("add"+ll);
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(0, "RPA");
		
		System.out.println(ll.get(0));
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		System.out.println("*****");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("enhanced loop");
		for(String str:ll) {
			System.out.println(str);
		}
		System.out.println("**iterator**");
		
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			String str1=it.next();
			System.out.println(str1);
		}
		
		System.out.println("**while**");{
			int num=0;
			while(ll.size()>num) {
				System.out.println(ll.get(num));
				num++;
			}
		}
	}

}
