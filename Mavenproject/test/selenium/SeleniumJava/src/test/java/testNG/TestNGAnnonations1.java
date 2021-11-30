package testNG;

import org.testng.annotations.*;


public class TestNGAnnonations1 extends BaseAnnontation {

    @Test
    @Parameters("uName")
    void m1(String name){
        System.out.println(name+" : test method1");
    }

    @Test
    void m2(){
        System.out.println("test method2");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("After suite");
    }
//   //below annotations are class specific
//    @BeforeMethod
//    void beforeMethod(){
//        System.out.println("Before Method");
//    }
//    @AfterMethod
//    void afterMethod(){
//        System.out.println("After Method");
//    }
//
//    @BeforeClass
//    void beforeClass(){
//        System.out.println("Before Class");
//    }
//    @AfterClass
//    void afterClass(){
//        System.out.println("After Class");
//    }
}
