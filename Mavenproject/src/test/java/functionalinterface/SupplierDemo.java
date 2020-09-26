package functionalinterface;

import java.util.function.Supplier;

public class SupplierDemo {
	
	
	
	public static void main(String[] args) {
//		Supplier<String>s=()->{
//			return "hi java";
//		};
//		System.out.println(s.get());
//		
		
		Supplier<String>s=()->"hi java";		
		System.out.println(s.get());
	}
	
}
