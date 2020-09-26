package functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedListDemo {
	
	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(1,20,2,3,5);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("reverse "+list);
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
	}

}
