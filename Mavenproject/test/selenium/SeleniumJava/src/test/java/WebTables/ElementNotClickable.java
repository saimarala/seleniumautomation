package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ElementNotClickable {

    @Test
    void validate() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
        List<WebElement> btn=driver.findElements(By.id("male"));
//        for(int i=0;i<btn.size();i++){
//            WebElement e=btn.get(i);
//            int x=btn.get(i).getLocation().getX();
//            if(x!=0){{
//                btn.get(i).click();
//                break;
//            }
//            }
//        }

        for (WebElement ele:btn){
            int x=ele.getLocation().getX();
            if(x!=0){
                ele.click();
                break;
            }
        }
         Thread.sleep(3000);
        driver.quit();

    }
}
