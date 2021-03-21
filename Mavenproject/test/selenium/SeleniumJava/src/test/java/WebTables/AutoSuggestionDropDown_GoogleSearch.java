package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;


public class AutoSuggestionDropDown_GoogleSearch {

    @Test
    void validateGoogleSearch() {
      try{
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.get("https://www.google.com/");
          driver.findElement(By.name("q")).sendKeys("testing");
          Thread.sleep(3000);
          List<WebElement> list=driver.findElements(By.xpath("//*[@class='sbct']//span"));
          System.out.println("size of Auto suggestions :"+list.size());
          for (WebElement listItem:list){
              if(listItem.getText().contains("testing techniques")) {
                  listItem.click();
                  break;
              }
          }
          driver.close();
      }catch (Exception e){

      }

    }
}
