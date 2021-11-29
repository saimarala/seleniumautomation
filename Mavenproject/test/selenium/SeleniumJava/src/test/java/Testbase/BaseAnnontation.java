package Testbase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseAnnontation {

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("After Method");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    void afterClass(){
        System.out.println("After Class");
    }
}
