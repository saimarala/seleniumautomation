package WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebElementDemo {

    @Test
    void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
       // ele.sendKeys("selenium", Keys.ENTER);
        ele.sendKeys("selenium"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.get("http://demo.automationtesting.in/Register.html");
        WebElement ele1=driver.findElement(By.tagName("select"));
//        List<WebElement>ls=wait.until(ExpectedConditions.visibilityOfAllElements(ele1));
        List<WebElement>ls=wait.until(d->d.findElements(By.tagName("select")));
        for (WebElement l:ls){
            System.out.println(l.getText());
        }
        driver.get("https://www.google.com/");
        WebElement ele3=wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("form")));
        ele3.findElement(By.name("q")).sendKeys("ABCD"+Keys.ENTER);
        driver.navigate().back();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))).sendKeys("selenium");
        driver.findElement(By.name("q")).sendKeys("selenium");
        String title=driver.switchTo().activeElement().getAttribute("title");
        System.out.println(title);
        WebElement searchBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        String tagName=searchBox.getTagName();
        String text=searchBox.getText();
        String cssValue=searchBox.getCssValue("font");
        System.out.println(tagName+":"+text+":"+cssValue);

        Thread.sleep(3000);
        driver.quit();

    }
}
