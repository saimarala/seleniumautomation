package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

    public static void main(String[] args) throws Throwable {


        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.MILLISECONDS);
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("saemarala@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("maralas@i123");
        driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();

        Thread.sleep(3000);
        driver.quit();
    }

}
