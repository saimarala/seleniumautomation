package selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StaleElementException {
    public WebDriver driver;
    @BeforeClass
    void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://www.pavantestingtools.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @Test
    void test() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='close']")).click();
        WebElement link=driver.findElement(By.xpath("//*[contains(text(),'Training')]"));
        link.click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='close']")).click();
        Thread.sleep(3000);

        try {
            link.click();
        }catch (Exception e){
            link=driver.findElement(By.xpath("//*[contains(text(),'Training')]"));
            link.click();
        }

    }

    @AfterClass
    void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
