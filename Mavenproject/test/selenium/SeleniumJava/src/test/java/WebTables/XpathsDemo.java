package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathsDemo {


    @Test
    void validateTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@value='Google Search']"));
        //or
        driver.findElement(By.xpath("//*[@value='Google Search' or name='btnK']"));
        //and
        driver.findElement(By.xpath("//*[@value='Google Search' and @name='btnK']"));
        //starta-with
        driver.findElement(By.xpath("//*[starts-with(@value,'Google')]"));
        //contains
        driver.findElement(By.xpath("//*[contains(@value,'Google')]"));
        //text
        driver.findElement(By.xpath("//*[text()='sss'"));
        driver.findElement(By.xpath("//*[starts-with(text(),'sss')]"));
        driver.findElement(By.xpath("//*[contains(text(),'sss')]"));
        //index
        driver.findElement(By.xpath("(//*[@value='Google Search'])[2]"));
        driver.findElement(By.xpath("(//*[@value='Google Search'])[last()]"));
        driver.findElement(By.xpath("(//*[@value='Google Search'])[last()-1]"));
        //position
        driver.findElement(By.xpath("(//*[@value='Google Search'])[position()=2"));
        driver.findElement(By.xpath("(//*[@value='Google Search'])[position()-1"));
        //self
        driver.findElement(By.xpath("//*[@value='Google Search']//self::*"));
        //parent
        driver.findElement(By.xpath("//*[@value='Google Search']//parent::*"));
        //child
        driver.findElement(By.xpath("//*[@value='Google Search']//child::*"));
        //ancestor
        driver.findElement(By.xpath("//*[@value='Google Search']//ancestor::*"));
        //descendant
        driver.findElement(By.xpath("//*[@value='Google Search']//descendant::*"));
        //following
        driver.findElement(By.xpath("//*[@value='Google Search']//following::*"));
        //preceding
        driver.findElement(By.xpath("//*[@value='Google Search']//preceding::*"));
        //following-sibling
        driver.findElement(By.xpath("//*[@value='Google Search']//following-sibling::*"));
        //preceding-sibling
        driver.findElement(By.xpath("//*[@value='Google Search']//preceding-sibling::*"));

    }
}
