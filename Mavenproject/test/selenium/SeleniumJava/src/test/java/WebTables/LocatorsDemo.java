package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class LocatorsDemo {
    @Test
    void demo(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.findElement(By.id("name"));
        driver.findElement(By.name("pwd"));
        driver.findElement(By.className("name"));
        driver.findElement(By.tagName("a"));
        driver.findElement(By.linkText("link text"));
        driver.findElement(By.partialLinkText("partial link text"));
        driver.findElement(By.xpath(""));
        driver.findElement(RelativeLocator.withTagName("input").
                above(By.id("name")).below(By.name("pwd")).
                near(By.id("ss")).
                toLeftOf(By.className("ss")).toRightOf(By.className("ss")));

    }
}
