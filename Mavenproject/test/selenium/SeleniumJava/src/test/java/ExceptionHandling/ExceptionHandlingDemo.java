package ExceptionHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class ExceptionHandlingDemo {
    WebDriver driver;

    @Test
    void checkedException() throws IOException, InterruptedException {
        //checked exception = IOException+InterruptedException+ subclasses
        //unchecked exception = All Run Time exceptions + subclasses
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        //MalformedURLException
        URL url=new URL("https://www.google.com/");
        driver.navigate().to(url);
        //FileNotFoundException
        FileInputStream fis=new FileInputStream("parh");
        Properties prop=new Properties();
        prop.load(fis);
        //InterruptedException
        Thread.sleep(3000);
    }

}
