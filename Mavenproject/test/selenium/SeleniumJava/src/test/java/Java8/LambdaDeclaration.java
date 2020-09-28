package Java8;

import org.testng.annotations.Test;

public class LambdaDeclaration {
    @Test
    public void test() {
        //traditional way
//        webPage w1=new webPage() {
//            @Override
//            public void header(String value) {
//                System.out.println("hi "+value);
//            }
//        };
//        w1.header("google");

        webPage w1 = (s, a) -> System.out.println("Hi " + s.toUpperCase() + " age :" + a);
        w1.header("google", 20);


    }
}
