package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SeleniumBase extends BaseTest {

    public  void getDriver(String url, String browserName) throws Throwable {
        Properties prop = new Properties();

        try {
            fis = new FileInputStream("C:\\Users\\marala\\git2\\Mavenproject\\src\\test\\java\\properties\\Config.properties");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        prop.load(fis);
        //System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
        //WebDriverManager.chromedriver().setup();
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("browser is not matching please give valid browser");
        }


        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(IMPLICITY_WAIT, TimeUnit.MILLISECONDS);
    }


    public void tearDown() {
        driver.quit();
    }

}
