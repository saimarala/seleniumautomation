package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Alerts {
    @Test
    void alerts() throws InterruptedException {
        //permission popuop notifications
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        driver.switchTo().alert().dismiss();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("test");
        Thread.sleep(4000);
        alert.accept();
        Thread.sleep(4000);

        //authenticated popup
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(4000);
        driver.quit();
    }


}
