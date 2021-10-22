package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class IsDisplayed {

    @Test
    void test()throws Exception, IOException ,Throwable {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        boolean displayed=driver.findElement(By.id("txtUsername")).isDisplayed();
        System.out.println(displayed);
        throw new RuntimeException();

    }
}
