package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo  {


	
	public static void main(String[] args) {
		Consumer<Integer> consumer=s->System.out.println("value is:"+s);
		
		consumer.accept(10);
		
		List<Integer>list=Arrays.asList(1,2,3,4,5);
			list.forEach(l->System.out.println(l));
			list.forEach(consumer);
			list.stream().forEach(consumer);
	}
	
	

}
