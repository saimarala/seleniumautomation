package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class LoginPage extends TestBase {
    //page factory
    @FindBy(name = "txtUsername")
    @CacheLookup//it will strore cache memeory,performance will be fast
            WebElement username;

    @FindBy(name = "txtPassword")
    WebElement password;

    @FindBy(xpath = "//*[@id='btnLogin']")
    WebElement loginbtn;
    //WebElement loginbtn;


    //initializing the page objects
    public LoginPage() {

        PageFactory.initElements(driver, this);
    }

    //Actions
    public String validateLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean validateimg() {
        return loginbtn.isDisplayed();
    }

    public HomePage login(String un, String pwd) {
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginbtn.click();
        return new HomePage();

    }


}
