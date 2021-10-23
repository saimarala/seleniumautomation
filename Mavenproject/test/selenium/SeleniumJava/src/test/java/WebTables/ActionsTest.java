package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTest {

    @Test
    void validateAction() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
//        driver.manage().window().maximize();
//        WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
//        WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
//        System.out.println("Location of the slider:"+min_slider.getLocation());
//        System.out.println("Location of the slider:"+min_slider.getSize());
//
        Actions a=new Actions(driver);
//        a.dragAndDropBy(min_slider,100,0).perform();
//        Thread.sleep(2000);
//        a.dragAndDropBy(min_slider,0,50).perform();
//
//        System.out.println("Location of the slider:"+min_slider.getLocation());
//        System.out.println("Location of the slider:"+min_slider.getSize());
//        Thread.sleep(2000);
//        a.dragAndDropBy(max_slider,-100,0).perform();
//        Thread.sleep(2000);
        driver.get("http://automationpractice.com/index.php");
        WebElement ele=driver.findElement(By.xpath("//a[@title='Women']"));
       // a.moveToElement(driver.findElement(By.xpath("//a[@title='Women']"))).perform();
        //build will return the action and perform will complete thw action
        //if we call perform internally its will call build
        Action act=a.moveToElement(ele).build();
        act.perform();
        Thread.sleep(5000);
        driver.quit();

    }
}
