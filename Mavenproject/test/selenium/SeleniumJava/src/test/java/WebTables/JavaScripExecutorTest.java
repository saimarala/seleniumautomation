package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScripExecutorTest {

    @Test
    void validateJS() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String getTitile=js.executeScript("return document.title").toString();
        System.out.println(getTitile);
        WebElement username=driver.findElement(By.xpath("//*[@id='txtUsername']"));
        WebElement loginBtn=driver.findElement(By.xpath("//*[@id='btnLogin']"));
        js.executeScript("arguments[0].style.border='3px solid red'",loginBtn);
        js.executeScript("arguments[0].value='Admin'",username);
        js.executeScript("arguments[0].click",loginBtn);
        js.executeScript("alert('alert')");
        driver.switchTo().alert().accept();
        js.executeScript("history.go(0)");
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        js.executeScript("document.body.style.zoom='150%'");
        Thread.sleep(3000);
        driver.quit();
    }
}
