package switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import util.SeleniumBase;

import java.awt.*;
import java.util.Set;

public class SpecificBrowser extends SeleniumBase {

    @Test
    void validateTest() throws Throwable {
        getDriver("https://www.google.com/","chrome");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("test");
        Set<String> winIds=driver.getWindowHandles();
        for(String winID:winIds){
            if(!driver.switchTo().window(winID).getTitle().equalsIgnoreCase("OrangeHRM")){
                driver.close();
            }
        }

        Thread.sleep(2000);
        driver.quit();


    }
}
