package ExceptionHandling;

import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

public class Return {


    @Test
    void t(){
       int i= m();
       System.out.println(i);
    }
    int m(){
        int i=2;
        try {
            return i=5/0;
        }catch (RuntimeException e){
            System.out.println("catch");
            return i=6;

        }finally {
            System.out.println("finally");
            return i=7;
        }
    }
}
