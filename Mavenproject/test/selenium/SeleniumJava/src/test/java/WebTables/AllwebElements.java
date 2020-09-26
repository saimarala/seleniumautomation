package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllwebElements {

    public static void main(String[] args) throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.spicejet.com/");

        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.MILLISECONDS);

        List<WebElement> allElements = driver.findElements(By.xpath("//*"));
        System.out.println("xpath : " + allElements.size());

        for (WebElement ele : allElements) {
            System.out.println(ele.getText());
        }

        driver.close();

    }

}
