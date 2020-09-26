package selenium4;

import java.io.File;
import java.util.List;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import org.testng.annotations.Test;
import util.TestBase;
import util.TestUtils;

public class Newtab extends TestBase {
    @Test
    void test() throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");

        WebDriver newDriver = driver.switchTo().newWindow(WindowType.WINDOW);
        newDriver.get("https://www.google.com/");
        newDriver.findElement(By.name("q")).sendKeys("selenium java");
        newDriver.findElement(By.name("btnK")).click();
        WebElement next = newDriver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        while (next.isEnabled()) {
            try {
                next.click();
            } catch (Exception e) {
                next = newDriver.findElement(By.xpath("//span[contains(text(),'Next')]"));
                next.click();
            } finally {
                next = newDriver.findElement(By.xpath("//span[contains(text(),'Next')]"));
                //next.click();
            }
        }
        do {
            System.out.println("1 time");
        } while (1 > 2);
        newDriver.close();
        Set<String> winhandles = driver.getWindowHandles();
        for (String winid : winhandles) {
            driver.switchTo().window(winid);
        }

        WebElement pwd = driver.findElement(By.name("txtPassword"));
        pwd.sendKeys("admin123");
        Rectangle pwdRect = pwd.getRect();
        System.out.println(pwdRect.height + ":" + pwdRect.width);
        System.out.println(pwdRect.getX() + ":" + pwdRect.getY());
        elementScreenShot(pwd, "pwd");
        driver.findElement(RelativeLocator.withTagName("input").below(By.name("txtPassword"))).click();


        List<WebElement> links = driver.findElements(RelativeLocator.withTagName("a").below(By.xpath("//*[@id='branding']//a//img")));

        System.out.println(links.size());
        for (WebElement link : links) {
            System.out.println(link.getText());
        }

        Thread.sleep(3000);
        driver.quit();
    }

    public static void elementScreenShot(WebElement element, String FileName) throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) element);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("./target/screenShots/" + FileName + ".png"));

    }

}
