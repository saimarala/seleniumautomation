package selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WebDriverMethods {

    @Test
    void impilicitlyWait(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        Cookie name = new Cookie("mycookie", "123456789123");
        driver.manage().getCookies();// Return The List of all Cookies
        Cookie c=driver.manage().getCookieNamed(name.getValue());////Return specific cookie according to name
        System.out.println(c);
        driver.manage().addCookie(name);//Create and add the cookie
        driver.manage().deleteCookie(name);// Delete specific cookie
        driver.manage().deleteCookieNamed(name.getName());// Delete specific cookie according Name
        driver.manage().deleteAllCookies();// Delete all cookies
        Set<Cookie> cookiesList =  driver.manage().getCookies();
        for(Cookie getcookies :cookiesList) {
            System.out.println(getcookies );
        }

        int width=driver.manage().window().getSize().getWidth();
        Dimension dim=driver.manage().window().getSize();
        int height=dim.getHeight();
        driver.manage().window().setSize(new Dimension(800,600));

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.manage().timeouts().pageLoadTimeout(20);

        driver.getCurrentUrl();
        driver.getTitle();
        driver.getPageSource();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().getText();
        driver.switchTo().alert().sendKeys("dd");
        driver.switchTo().alert().dismiss();
        driver.switchTo().window("d");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().frame(1);
        driver.switchTo().frame("iframe");
        driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
        Set<String> s=driver.getWindowHandles();
        String parent= driver.getWindowHandle();

        driver.navigate().to("");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
