package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyDemo2 {

//    @Test
//    void login(){
//        //Assert.fail("dd");
//        System.out.println("==>user should be able to login with valid credentails");
//    }
    @Test
    void login(){
        //Assert.fail("dd");
        System.out.println("==>user should be able to login with valid credentails");
    }
    @Test(dependsOnMethods = "login",alwaysRun = true)
    void createLoan(){
        Assert.assertFalse(true);
        System.out.println("==> use create a new loan file");
    }
    @Test(dependsOnMethods = {"login","createLoan"},alwaysRun = true)
    void exportToPDF(){
        System.out.println("==>user can export laon in to PDF");
    }
}
