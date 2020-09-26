package switchTo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.TestUtils;

public class frames extends TestUtils {

    public static void main(String[] args) throws Throwable {
        TestUtils.getDriver("http://demo.automationtesting.in/Index.html");

        //clickOnXpath("//*[@id='enterimg']");
        driver.findElement(By.xpath("//*[@id='enterimg']")).click();

        Actions a = new Actions(driver);
        WebElement e = driver.findElement(By.xpath("//*[text()='SwitchTo']"));

        a.moveToElement(e).click().build().perform();

        List<WebElement> links = driver.findElements(By.xpath("//*[@class='dropdown-menu']//li//child::*[1]"));
        System.out.println(links.size());
        for (WebElement link : links) {
            if (link.getAttribute("innerHTML").equals("Alerts")) {
                link.click();
                break;
            }
        }
        //frames
        //				List<WebElement> frames=driver.findElements(By.tagName("iframe"));
        //				System.out.println("frames:"+frames.size());
        //				Thread.sleep(3000);
        //				//frames
        //				driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
        //
        //				driver.switchTo().frame("SingleFrame");
        //
        //				driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("selenium");
        //				driver.switchTo().defaultContent();
        //
        //				driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
        //				driver.switchTo().frame(1);
        //				driver.switchTo().frame(0);
        //				driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("automation");
        //
        //				driver.switchTo().defaultContent();
        //
        //				driver.findElement(By.linkText("Home")).click();
        //alerts
        //click the button to display an  alert box:
        driver.findElement(By.linkText("Alert with OK")).click();
        driver.findElement(By.xpath("//*[@onclick='alertbox()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        //cancel
        Thread.sleep(2000);
        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
        driver.findElement(By.xpath("//*[@onclick='confirmbox()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        //getText
        Thread.sleep(2000);
        driver.findElement(By.linkText("Alert with Textbox")).click();
        driver.findElement(By.xpath("//*[@onclick='promptbox()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("automation");
        String text = driver.switchTo().alert().getText();
        System.out.println("alert:" + text);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        driver.navigate().to("http://demo.automationtesting.in/Dynamic.html");
        Thread.sleep(5000);
        WebElement ele = driver.findElement(By.linkText("Interactions"));
        a.moveToElement(ele).click().build().perform();
        WebElement ele1 = driver.findElement(By.linkText("Drag and Drop"));
        a.moveToElement(ele1).click().build().perform();
        list("//*[@class='dropdown-menu']//li//child::*[1]", "Dynamic ");
//		WebElement e1=driver.findElement(By.xpath("//*[@id='node']"));
//		WebElement e2=driver.findElement(By.xpath("//*[@id='droparea']//*[@id='msg']//*[@id='node']"));
//		a.dragAndDrop(e1, e2).build().perform();

        list("//*[@class='dropdown-menu']//li//child::*[1]", "File Upload");
        driver.findElement(By.xpath("//*[@id='save']")).click();
        driver.findElement(By.xpath("//*[@type='file']")).sendKeys("C:\\Users\\sai\\Desktop\\junit.txt");
        Thread.sleep(5000);
        driver.quit();


    }

}
