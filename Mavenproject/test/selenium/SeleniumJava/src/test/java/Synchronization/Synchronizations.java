package Synchronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Synchronizations {
    WebDriver driver;

    @Test
    void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().getPageLoadTimeout();
        Duration c = driver.manage().timeouts().getImplicitWaitTimeout();
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().getPageLoadTimeout();
        driver.manage().timeouts().getScriptTimeout();

        System.out.println(c.getSeconds());
        driver.findElement(By.xpath("//*[@onclick='swapCheckbox()']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@onclick='swapCheckbox()']")).click();
        WebElement ele=driver.findElement(By.xpath("//*[@onclick='swapCheckbox()']"));

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //driver.findElement(By.id("checkbox")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("checkbox"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox")));
        wait.until(ExpectedConditions.alertIsPresent());
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("checkbox")));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));

        wait.until(ExpectedConditions.urlContains("sa"));
        wait.until(ExpectedConditions.urlToBe("dd"));
        wait.until(ExpectedConditions.urlMatches("ss"));

        wait.until(ExpectedConditions.titleContains("gg"));
        wait.until(ExpectedConditions.titleIs("ff"));

        wait.until(ExpectedConditions.attributeContains(By.id("checkbox"),"title","google"));
        wait.until(ExpectedConditions.attributeToBe(By.id("checkbox"),"id","uName"));
        wait.until(ExpectedConditions.attributeContains(ele,"title","orange"));

        //wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.id("checkbox"))).size();
        wait.until(ExpectedConditions.visibilityOf(ele));
        wait.until(ExpectedConditions.visibilityOfAllElements(ele));

        wait.until(ExpectedConditions.invisibilityOfAllElements(ele));
        wait.until(ExpectedConditions.invisibilityOf(ele));

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("checln")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bb")));

        //wait.until(ExpectedConditions.textMatches(By.id("chech"),"\\s//"));
        wait.until(ExpectedConditions.textToBePresentInElement(ele,"test"));
        wait.until(ExpectedConditions.textToBePresentInElementValue(ele,"ff"));

        Wait<WebDriver> wait1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);
        wait1.until(ExpectedConditions.elementToBeClickable(By.id("checkbox"))).click();


    }

    @AfterClass
    void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
