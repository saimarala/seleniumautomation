package switchTo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import util.SeleniumBase;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class SpecificBrowser extends SeleniumBase {

    @Test
    void validateTest() throws Throwable {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("test");
        Set<String> winIds=driver.getWindowHandles();
       // for(String winID:winIds){
        for(String winID:driver.getWindowHandles()){
            if(!driver.switchTo().window(winID).getTitle().equalsIgnoreCase("OrangeHRM")){
                driver.close();
            }
        }
        Iterator<String> win=winIds.iterator();
        while (win.hasNext()){
            String id=win.next();
            if(!driver.switchTo().window(id).getTitle().equalsIgnoreCase("OrangeHRM")){
                driver.close();
            }
        }

        ArrayList<String> ls=new ArrayList<>(winIds);
        for (int i=0;i<ls.size();i++){
            if(!driver.switchTo().window(ls.get(i)).getTitle().equalsIgnoreCase("OrangeHRM")){
                driver.close();
            }
        }

        Thread.sleep(2000);
        driver.quit();


    }
}
