package selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.BaseTest;

public class ChromeOption extends BaseTest {

    @BeforeClass
    void setUp() {
        // DesiredCapabilities dc=new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        //options.setHeadless(true);
        options.addArguments("--disable-infobars");
        options.addArguments("start-maximized");
        // options.addArguments("incognito");

        //options.addArguments("--headless");

        //options.setAcceptInsecureCerts(true);
        System.out.println(options.getVersion());

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");

    }

    @Test
    void test() {
        System.out.println("opened");
    }

    @AfterClass
    void tearDown() throws InterruptedException {
        //Thread.sleep(5000);
        driver.quit();
    }
}
