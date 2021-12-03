package Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;

public class PageRefresh {

    @Test
    void test() throws IOException, InterruptedException, AWTException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.get(driver.getCurrentUrl());
        driver.navigate().to(driver.getCurrentUrl());
        URL url=new URL(driver.getCurrentUrl());
        driver.navigate().to(url);

        ((JavascriptExecutor)driver).executeScript("window.location.reload(true)");

        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_R);
        r.keyRelease(KeyEvent.VK_R);
        r.keyRelease(KeyEvent.VK_CONTROL);

        r.keyPress(KeyEvent.VK_F5);
        r.keyRelease(KeyEvent.VK_F5);

        Actions a=new Actions(driver);
        a.keyDown(Keys.SHIFT).sendKeys(Keys.F5).keyUp(Keys.SHIFT).perform();
        a.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).perform();

        driver.findElement(By.tagName("a")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
        driver.findElement(By.tagName("a")).sendKeys(Keys.F5);
        Thread.sleep(2000);
        driver.quit();

    }
}
