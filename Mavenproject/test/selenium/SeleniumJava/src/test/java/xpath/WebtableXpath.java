package xpath;

//import com.sun.javafx.image.ByteToIntPixelConverter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebtableXpath {

    @Test
    void xpathWebtable() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10,20),Duration.ofSeconds(60));
        driver.findElement(By.xpath("//div[@id='logInPanelHeading']//following::div//input[@id='txtUsername']")).sendKeys("Admin");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='logInPanelHeading']//following::input[@id='txtPassword']"))).sendKeys("admin123");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='logInPanelHeading']//following::input[@id='btnLogin']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='OrangeHRM']"))).isDisplayed();
        Actions a = new Actions(driver);
        WebElement ele1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Admin']")));
        a.moveToElement(ele1).perform();
        WebElement ele2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='User Management']")));
        a.moveToElement(ele2).perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='User Management']//following::li//a[text()='Users']"))).click();
//        String eName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Aravind']//following::td[2]"))).getText();
//        System.out.println(eName);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Username']"))).click();
//       WebElement eName2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Aravind']//following::td[2]")));
//
//        wait.until(ExpectedConditions.textToBePresentInElement(eName2,"Dominic Chase"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnAdd"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='systemUser_userType']//following::select[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='systemUser_userType']//following::select[@id='systemUser_userType']//option[1]"))).click();


       Select s = new Select(driver.findElement(By.id("systemUser_status")));
       s.selectByValue("0");
       s.selectByIndex(0);
       s.selectByVisibleText("Disabled");

        List<WebElement>ele=s.getOptions();
        for(WebElement e:ele){
            if(e.getText().equals("Disabled")){
                e.click();
                break;
            }
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
