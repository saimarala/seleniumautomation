package BootStrap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class MouseHover {

    @Test
    void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");

        Thread.sleep(2000);

        WebElement hoverMouse = driver.findElement(By.xpath("//button[@class='dropbtn']"));

        Actions moveTo = new Actions(driver);

        Thread.sleep(3000);

        moveTo.moveToElement(hoverMouse).perform();

        Thread.sleep(3000);

        List<WebElement> list = driver.findElements(By.xpath("//*[@class='dropdown']//*/a"));

        for (WebElement e : list) {

            if (e.getText().equals("TestNG")) {

                System.out.println("Selecting text:" + e.getText());

                e.click();

                break;

            }
        }

        driver.quit();

    }
}
