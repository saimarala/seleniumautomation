package Methodoverlading;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SelenuimJavaMethodOverloading{

    @Test
    void java(){
        System.out.println();
        System.out.println("sss");
        System.out.println(1);
        System.out.println(true);
        System.out.println('s');

    }

    @Test
    void actions() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       // driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        driver.get("https://jqueryui.com/");
//        WebElement ele1=driver.findElement(By.id("draggable"));
//        WebElement ele2=driver.findElement(By.id("droppable"));
        WebElement ele3=driver.findElement(By.xpath("//a[normalize-space()='Demos']"));
        WebElement ele4=driver.findElement(By.xpath("//a[normalize-space()='Draggable']"));
        Actions a=new Actions(driver);
       // a.click(ele3).perform();
       // a.moveToElement(ele3).click().perform();

        //a.doubleClick(ele3).perform();
        a.moveToElement(ele3).
                doubleClick(ele4).perform();
//        a.contextClick(ele3).perform();
//        a.moveToElement(ele3).contextClick(ele3).perform();


        Thread.sleep(3000);
        driver.quit();
    }
}
