package selenium4;

import com.hrm.qa.util.WebEventListner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class WebDriverEventListnerDemo {


    @Test
    void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        EventFiringWebDriver e_driver=new EventFiringWebDriver(driver);
        WebEventListner eventListener=new WebEventListner();
        e_driver.register(eventListener);
        e_driver.get("https://www.google.com/");
    }
}
