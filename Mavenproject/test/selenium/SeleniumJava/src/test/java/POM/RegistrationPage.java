package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegistrationPage {

   public WebDriver driver;
    //syntax 1
    @FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
    WebElement fName;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
    WebElement lName;

    //syntax 2
    @FindBy(xpath = "//input[@type='email']")
    WebElement email;

    @FindBy(id="submitbtn") WebElement submit;

    @FindBy(id = "firstpassword")
    WebElement fPassword;

    @FindBy(xpath = "//*[@type='checkbox']")
    List<WebElement>ls;

    RegistrationPage(WebDriver driver) {
        this.driver=driver;
       // PageFactory.initElements(driver,this);
    }

    void fName(String fiName){
        fName.sendKeys(fiName);
        fName.click();
        fName.clear();
        fName.sendKeys(fiName);
    }

    void lName(String liName){
        lName.sendKeys(liName);
    }
    void setEmail(String emaila){
        email.sendKeys(emaila);
    }
    void  setfPassword(String setfPassword){
        fPassword.sendKeys(setfPassword);
    }
    String getTitle(){
        return driver.getTitle();
    }
    void setSubmit(){
        submit.click();
    }
    int setChheckBoxes(){

        return ls.size();
    }
    void clickCheck(){
        for (WebElement ele:ls){
            if (ele.getAttribute("id").equals("checkbox3")){
                ele.click();
                break;
            }
        }
    }
}
