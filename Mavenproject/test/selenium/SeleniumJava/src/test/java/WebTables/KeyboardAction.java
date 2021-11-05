package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardAction {
    @Test
    void validateKeyboard() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/key_presses");
        Actions act=new Actions(driver);
//        act.sendKeys(Keys.RETURN).perform();
//        Thread.sleep(2000);
//        act.sendKeys(Keys.BACK_SPACE).perform();
//        Thread.sleep(2000);
//        act.sendKeys(Keys.SPACE).perform();
//       Thread.sleep(2000);
//        act.sendKeys(Keys.ESCAPE).perform();
//        Thread.sleep(3000);
        driver.get("https://text-compare.com/");
        WebElement input1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        WebElement input2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
        input1.sendKeys("Welcome");
        act.keyDown(Keys.CONTROL);
        act.sendKeys("a");
        act.keyUp(Keys.CONTROL);
        act.perform();

        act.keyDown(Keys.CONTROL);
        act.sendKeys("c");
        act.keyUp(Keys.CONTROL);
        act.perform();
        act.sendKeys(Keys.TAB).perform();
        act.keyDown(Keys.CONTROL);
        act.sendKeys("v");
        act.keyUp(Keys.CONTROL);
        act.perform();


        driver.quit();
    }
}
