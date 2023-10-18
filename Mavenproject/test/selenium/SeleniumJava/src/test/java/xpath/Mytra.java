package xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class Mytra {
    //public  WebDriver driver;
    @Test
    void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        navElements(driver,"//a[text()='Men']","//a[text()='Bottomwear']/../following-sibling::li/a[text()='Jeans']");
        navElements(driver,"//a[text()='Women']","//a[text()='Footwear']/../following-sibling::li/a[text()='Flats']");
        Thread.sleep(3000);
        driver.get("https://www.flipkart.com/");

        flip(driver,"//div[text()='Fashion']","//a[text()='Women Western']","//a[text()='Women Dresses']");
        Thread.sleep(5000);
        Assert.assertTrue(driver.getCurrentUrl().contains("womens-dresses"));
        driver.quit();

    }
    void navElements(WebDriver driver,String navxpath,String subxpath){
        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath(navxpath))).perform();
        driver.findElement(By.xpath(subxpath)).click();

    }

    void flip(WebDriver driver,String navxpath,String subxpath,String xpath){
        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath(navxpath))).perform();
        a.moveToElement(driver.findElement(By.xpath(subxpath))).perform();
        driver.findElement(By.xpath(subxpath)).click();

    }
}
