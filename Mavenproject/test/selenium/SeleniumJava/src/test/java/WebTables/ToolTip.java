package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTip {
    @Test
    void validateTooltip(){
       WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2019/08/tooltip-in-selenium-or-help-text-example.html");
        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//*[@class='tooltip']"))).perform();
        String tooltiptext=driver.findElement(By.xpath("//*[@class='tooltiptext']")).getText();
        System.out.println(tooltiptext);
        Assert.assertTrue(tooltiptext.contains("Tooltip text"));
       // driver.get("https://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html");

        driver.close();
    }
}
