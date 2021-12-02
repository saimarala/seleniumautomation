package ExceptionHandling;

import java.io.IOException;

public class Parent {
 //   If the superclass method does not declare an exception?

//    If the superclass method does not declare an exception,
//    subclass overridden method cannot declare the checked exception
//    but it can declare unchecked exception.


//    If the superclass method declares an exception?

//    If the superclass method declares an exception,
//    subclass overridden method can declare same, subclass exception or no exception
//    but cannot declare parent exception.
    void m1(){
        System.out.println("m1");
    }
    void m2() throws IOException {
        System.out.println("m2");
    }

    void m3() throws Exception {
        System.out.println("m3");
    }
}
