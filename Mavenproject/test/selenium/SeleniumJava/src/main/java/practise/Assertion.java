package practise;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void test1() {
        Assert.assertEquals(true, true);
        System.out.println("enter username");
        System.out.println("pwd");
        System.out.println("click on loginbtn");
        Assert.assertEquals(true, true);//hard assert
        System.out.println("validate home page");
        softAssert.assertEquals(false, true);//softassert
        System.out.println("go to deals");
        System.out.println("create deal");

        softAssert.assertEquals(false, true, "not able to reached contact page");//softassert
        System.out.println("go to contact page");
        System.out.println("create contact");

        softAssert.assertEquals(true, true);//softassert
        System.out.println("go to order");
        System.out.println("create order");
        softAssert.assertAll();
    }

    @Test
    public void test2() {
        System.out.println("logout");
        softAssert.assertEquals(false, true);

        softAssert.assertAll("log out issue");
    }

}
