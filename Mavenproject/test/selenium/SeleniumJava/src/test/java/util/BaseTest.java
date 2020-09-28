package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static  WebDriver driver;
    public static long PAGE_LOAD_TIMEOUT = 30000;
    public static long IMPLICITY_WAIT = 30000;
    public static Properties prop;
    public static FileInputStream fis;

       @BeforeClass
    void ConfigureSetup() {
        //wait=new WebDriverWait(driver,60);
        //wait=new FluentWait<WebDriverWait>(driver).

    }
}
