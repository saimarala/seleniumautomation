package Actions;

import Super.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {


    @Test
    void  m() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        Actions a=new Actions(driver);
        WebElement ele1=driver.findElement(By.id("draggable"));
        WebElement ele2=driver.findElement(By.id("droppable"));
       // a.dragAndDrop(ele1,ele2).perform();
        //a.dragAndDropBy(ele1,200,300).perform();
       // a.clickAndHold(ele1).moveToElement(ele2).release().perform();
       // a.clickAndHold(ele1).moveByOffset(500,300).release().perform();
        Thread.sleep(3000);
        driver.quit();
    }
}
