package Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyPaste {
    WebDriver driver;

    @Test
    void m1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        WebElement ele1=driver.findElement(By.xpath("//input[@type='email']"));
        WebElement ele2=driver.findElement(By.xpath("//input[@type='tel']"));
        Actions a=new Actions(driver);
        a.moveToElement(ele1).click().sendKeys("test123");
        a.keyDown(Keys.CONTROL).sendKeys("a","c");
        //a.sendKeys("c");

        a.moveToElement(ele2).click().keyDown(Keys.CONTROL).sendKeys("v");
        a.keyUp(Keys.CONTROL).perform();
                //.keyUp(Keys.CONTROL).sendKeys("a","c")
        Thread.sleep(2000);
        driver.get("https://the-internet.herokuapp.com/context_menu");;
        WebElement ele3=driver.findElement(By.xpath("//div[@id='hot-spot']"));
        a.contextClick(ele3).perform();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.quit();
    }
}
