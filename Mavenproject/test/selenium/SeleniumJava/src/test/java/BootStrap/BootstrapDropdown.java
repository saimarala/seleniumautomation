package BootStrap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class BootstrapDropdown {

    @Test
    void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("menu1")).click();
        Thread.sleep(1000);
        List<WebElement>ls=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
        for (WebElement ele:ls){
            System.out.println(ele.getText());
            if (ele.getText().equals("JavaScript")){
                ele.click();
                break;
            }
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
