package MyPackage;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationDemo {


    @Test
    void test1(){
        System.out.println("A");
        Assert.assertFalse(true);

    }
    //default value for enabled is true and alwaysRun is false
    @Test(alwaysRun = true,dependsOnMethods = "test1",enabled = false)
    //only test1 it will run because enbaled =false
    void test2(){
        System.out.println("B");
    }

    @Test(alwaysRun = true,dependsOnMethods = "test1")
    void test3(){
        //it will execute always becuase alwaysRun=true
        System.out.println("C");
    }
    @Test(enabled = true,dependsOnMethods = "test1")
   void test4(){
        System.out.println("D");
    }

    @Test(groups = "QA")
    void test5(){
        System.out.println("E");
    }
    @Test(groups = "QA",invocationCount = 10,threadPoolSize = 3)
    //threadPoolSize is used to execute suites in parallel.
        // Each suite can be run in separate  thread

    //invocationCount number of times this method should be invoked
    void test6(){
        System.out.println("F");
    }
    @Test(groups = "QA")
    void test7(){
        System.out.println("G");
        Assert.fail("ddd");
    }
    @Test(dependsOnGroups = "QA")
    void test8(){
        System.out.println("H");
    }
    @Test(dependsOnGroups = "QA",alwaysRun = true)
    void test9(){
        System.out.println("I");
    }
    @Test(priority = 1,groups = "Selenium")
    void test10(){
        System.out.println(10);
    }
    @Test(priority = 1,groups = "Selenium")
    void test11(){
        System.out.println(11);
    }
    @Test(priority = 2,groups = "Selenium")
    void test12(){
        System.out.println(12);
    }
    @Test
    @Parameters({"uName","pwd"})
    void test13(String u,String p){
        System.out.println(12);
    }

}
