package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    //  public WebDriverWait wait;
    public Wait<WebDriverWait> wait;

    @BeforeClass
    void ConfigureSetup() {
        //wait=new WebDriverWait(driver,60);
        //wait=new FluentWait<WebDriverWait>(driver).

    }
}
