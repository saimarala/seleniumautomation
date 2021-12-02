package ExceptionHandling;

import java.io.IOException;

public class Child extends Parent {

    void m1()throws RuntimeException{
        System.out.println(" child m1");
    }
    void m2() throws IOException{
        System.out.println("child m2");
    }

    void m3() {
        System.out.println("m3");
    }
}
