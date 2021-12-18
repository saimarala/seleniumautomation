package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyDemo1 {

//    @Test
//    void login(){
//        //Assert.fail("dd");
//        System.out.println("==>user should be able to login with valid credentails");
//    }
    @Test(enabled = false)
    void login(){
        //Assert.fail("dd");
        System.out.println("==>user should be able to login with valid credentails");
    }
    @Test(dependsOnMethods = "login",ignoreMissingDependencies = true)
    void createLoan(){
        Assert.assertFalse(false);
        System.out.println("==> use create a new loan file");
    }
    @Test(dependsOnMethods = {"login","createLoan"},ignoreMissingDependencies = true)
    void exportToPDF(){
        System.out.println("==>user can export laon in to PDF");
    }
}
