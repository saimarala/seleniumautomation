package docker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerClass {
    @Test
    public void dockerChrome() throws MalformedURLException {
        //DesiredCapabilities dc=DesiredCapabilities.chrome();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(BrowserType.FIREFOX);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);

//            DesiredCapabilities dc=DesiredCapabilities.firefox();
//            URL url=new URL("http://localhost:4444/wd/hub");
//            RemoteWebDriver driver=new RemoteWebDriver(url,dc);
        driver.get("https://www.google.com/");
        System.out.println("Title of the page :" + driver.getTitle());
        driver.quit();
    }
}
