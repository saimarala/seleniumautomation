package selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class PageLoadingDemo {
    WebDriver driver;
    @Test
    void m() throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        //waits for the entire page to be loaded
        //Se webdriver waits until the load event fire is returned
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
      //  When set to none Selenium WebDriver only waits until
        //  the initial page is downloaded
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(options);
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.quit();
        //waits until the initial HTML document has been completely loaded and parsed
        //discards loading of stylesheets, images and subframes
        //Se webdriver waits until the DOMContentLoaded event fire is returned
        FirefoxOptions fOptions=new FirefoxOptions();
        fOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver(fOptions);
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.quit();
    }
}
