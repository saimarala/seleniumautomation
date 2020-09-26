package selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Svg {
    public WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://debeissat.nicolas.free.fr/svg3d.php");
        Thread.sleep(3000);

    }
    @Test
    void dd(){
        driver.switchTo().frame("svg_result");
        List<WebElement> eleList=driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g' and @id='g2' ]//*[local-name='path'and contains(@id,'face')]"));
        System.out.println(eleList.size());
        for (WebElement ele :eleList){
            String text=null;
            text=ele.getAttribute("d");
            System.out.println(text);
        }
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
