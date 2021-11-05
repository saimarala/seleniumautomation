package WebTables;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class getClassName {

    @Test
    void classname(){
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this.getClass().getClass());
        String classNam=this.getClass().getSimpleName();
        System.out.println(classNam);

    }
}
