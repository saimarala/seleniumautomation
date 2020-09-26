package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    //	@Override
//	public boolean test(Integer t) {
//		if(t%2==0) {
//			return true;
//		}
//		return false;
//	}
    public static void main(String[] args) {
//		PredicateDemo p=new PredicateDemo();
//		System.out.println(p.test(7));
//		Predicate<Integer>p=t->{
//			if(t%2==0) {
//				return true;
//			}else {
//				return false;
//			}
//		};
//		System.out.println(p.test(10));
        //optimize above code
        Predicate<Integer> p = t -> t % 2 == 0;
        System.out.println(p.test(20));
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        l.stream().filter(p).forEach(t -> System.out.println("even number :" + t));
        l.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("even number :" + t));

    }
}
