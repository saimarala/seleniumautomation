package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Testbase.testBase;
import switchTo.getWindowHandlers;

public class TestUtils extends testBase {
    //public static WebDriver driver;

    public static long PAGE_LOAD_TIMEOUT = 30000;
    public static long IMPLICITY_WAIT = 30000;
    public static Properties prop;
    public static FileInputStream fis;


    public static void getDriver(String url) throws Throwable {
        Properties prop = new Properties();

        try {
            fis = new FileInputStream("C:\\Users\\marala\\git2\\Mavenproject\\src\\test\\java\\properties\\Config.properties");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        prop.load(fis);
        System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));

        driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(IMPLICITY_WAIT, TimeUnit.MILLISECONDS);
    }

    public static void switchToWindow(String exp) {
        Set<String> windowIds = driver.getWindowHandles();
        System.out.println("windoeCount:" + windowIds.size());
        //Iterator<String>iter=windowIds.iterator();
        for (String child : windowIds) {
            driver.switchTo().window(child);
            if (driver.getCurrentUrl().equalsIgnoreCase(exp)) {
                System.out.println(driver.getCurrentUrl() + ":" + driver.getTitle());
                break;
            }

        }

    }


    public static void list(String xpath, String exp) {
        List<WebElement> links = driver.findElements(By.xpath(xpath));
        System.out.println(links.size());
        for (WebElement link : links) {
            if (link.getAttribute("innerHTML").equalsIgnoreCase(exp)) {
                link.click();
                break;
            }
        }
    }

    //xpath
    public static void sendkeysXpath(String xpath, String value) {
        driver.findElement(By.xpath(xpath)).sendKeys(value);
    }

    public static void sendkeysId(String id, String value) {
        driver.findElement(By.id(id)).sendKeys(value);
    }

    public static void clickOnXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public static void clickOnId(String id) {
        driver.findElement(By.id(id)).click();
    }

    public static void clickOnLinkText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
