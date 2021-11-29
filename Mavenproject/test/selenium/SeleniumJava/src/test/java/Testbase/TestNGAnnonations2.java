package Testbase;

import org.testng.annotations.*;

public class TestNGAnnonations2 extends BaseAnnontation {

    @Test
    void m3(){
        System.out.println("test method3");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    void afterTest(){
        System.out.println("After Test");
    }
}
