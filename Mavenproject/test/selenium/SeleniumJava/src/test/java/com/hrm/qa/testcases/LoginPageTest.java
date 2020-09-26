package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;
import com.hrm.qa.util.CustomListener;


@Listeners(CustomListener.class)
public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPagetitleTest() {
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals("OrangeHRM", title);
    }

    @Test(priority = 2)
    public void hrmimage() {
        boolean flag = loginPage.validateimg();
        Assert.assertTrue(!flag);
    }

    @Test(priority = 3)
    public void loginTest() {
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        Assert.assertEquals(false, true);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }

}
