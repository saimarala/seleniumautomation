package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoCompleteGooglePlacesDropDown {
    @Test
   void  ValidateAutoComplete(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.twoplugs.com/newsearchserviceneed");
        WebElement searchBox=driver.findElement(By.id("autocomplete"));
        searchBox.clear();
        searchBox.sendKeys("Toronto");
        String text;
        do {
            searchBox.sendKeys(Keys.ARROW_DOWN);
            text=searchBox.getAttribute("value");
            if (text.equals("Toronto, OH, USA")){
                searchBox.sendKeys(Keys.ENTER);
                break;
            }
        }while (!text.isEmpty());
        driver.close();
    }
}
