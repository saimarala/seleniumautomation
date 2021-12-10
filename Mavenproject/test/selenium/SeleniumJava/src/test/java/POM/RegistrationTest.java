package POM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationTest {
    public static WebDriver driver;
    @Test
    void verifyReg() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
       // RegistrationPageFactory regPage=new RegistrationPageFactory(driver);
        RegistrationPage regPage=PageFactory.initElements(driver,RegistrationPage.class);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        regPage.fName("test");
        regPage.lName("last");
        regPage.setEmail("sss");
        regPage.setfPassword("ssss");
        regPage.setSubmit();
        System.out.println(regPage.setChheckBoxes());
        regPage.clickCheck();
        if (regPage.getTitle().equals("Register")){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }

        Thread.sleep(4000);
        driver.quit();


    }
}
