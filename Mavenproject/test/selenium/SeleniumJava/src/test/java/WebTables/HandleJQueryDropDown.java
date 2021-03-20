package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import util.SeleniumBase;

import java.util.List;

public class HandleJQueryDropDown extends SeleniumBase {
  @Test
    void JQueryDropDown() throws Throwable {
      getDriver("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/","chrome");
      driver.findElement(By.id("justAnInputBox")).click();
     // selectChoicesValue(driver,"choice 1");
      //(driver,"choice 2","choice 2 3","choice 6","choice 6 2 1","choice 6 2");
       selectChoicesValue(driver,"all");
      Thread.sleep(3000);
        }

        public void selectChoicesValue(WebDriver driver,String... value){
        List<WebElement>choiceList=driver.findElements(By.xpath("//*[@class='comboTreeItemTitle']"));
        if(!value[0].equalsIgnoreCase("all")){
            for(WebElement item:choiceList){
                String text=item.getText();
                for (String val:value){
                    if (text.equals(val)){
                        item.click();
                        break;
                    }
                }
            }
        }else {
           try {
               for(WebElement item:choiceList){
                   item.click();
               }
           }catch (Exception e){

           }
        }

        }
}
