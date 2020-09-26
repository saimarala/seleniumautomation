package selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.TestBase;

public class FirefoxOption extends TestBase {

    @BeforeClass
    void setUp(){

        FirefoxOptions options=new FirefoxOptions();
        options.addArguments("start-maximized");
       // options.addArguments("incognito");
        //options.addArguments("--headless");
        options.setHeadless(false);


        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver(options);
        driver.get("https://www.google.com/");

    }
    @Test
    void test(){
        System.out.println("opened");
    }

    @AfterClass
    void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
