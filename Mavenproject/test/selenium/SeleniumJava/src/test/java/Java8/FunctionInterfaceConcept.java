package Java8;

import org.testng.annotations.Test;

import java.util.function.Function;

public class FunctionInterfaceConcept {
@Test
    void functionalInterfaceTest(){

    //Interface Function<T,R>
    //Type Parameters:
    //T - the type of the input to the function
    //R - the type of the result of the function
    Function<String,Integer> func=x->x.length();
   int len= func.apply("Hi Selenium");
    System.out.println(len);
    //chaining function
    Function<Integer,Integer>func2=x->x*2;
    int result=func.andThen(func2).apply("this is selenium");
    System.out.println(result);

    }
}
