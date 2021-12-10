package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class normalWay {

    WebDriver driver;
    By uName= By.id("txtUsername");
    By pwd=By.id("txtPassword");
    By login=By.id("btnLogin");
    normalWay(WebDriver driver){
        this.driver=driver;
    }

    void setuName(String userName,String pass){
        driver.findElement(uName).sendKeys(userName);
        driver.findElement(pwd).sendKeys(pass);

    }
    void setLogin(){
        driver.findElement(login).click();
    }
}
