package testNG;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MetodOverloading {


    @Test
    void login(){
         Assert.fail("dd");
        System.out.println("==>user should be able to login with valid credentails");
    }
    @Test(dependsOnMethods = "login")
    void createLoan(){
        Assert.assertFalse(true);
        System.out.println("==> use create a new loan file");
    }
    @Parameters("loan amount")
    @Test
    void createLoan(@Optional("1000") String loanAmount){
        System.out.println("==> use create overloaded a new loan file");
    }
    @Test(dependsOnMethods = {"login","createLoan"},alwaysRun = true)
    void exportToPDF(){
        System.out.println("==>user can export laon in to PDF");
    }
}
