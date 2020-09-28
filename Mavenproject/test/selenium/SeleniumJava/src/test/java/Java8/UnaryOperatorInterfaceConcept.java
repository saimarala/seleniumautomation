package Java8;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {
    @Test
    void UnaryTest() {
        //Represents an operation on a single operand that produces a result of the
        // same type as its operand. This is a specialization of Function
        // for the case
        // where the operand and result are of the same type.
        UnaryOperator<Integer>func=x->x*7;
        System.out.println(func.apply(10));
        Function<Integer,Integer>func2=x->x*10;
        System.out.println(func2.apply(40));
        List<String> arrList=Arrays.asList("Java","Selenium");
        arrList.forEach(s -> System.out.println(s));
        arrList.replaceAll(s->s+"sai");
        System.out.println(arrList);


    }
}
