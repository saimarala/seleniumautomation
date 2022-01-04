package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import util.SeleniumBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HandleJQueryDropDown extends SeleniumBase {
  @Test(enabled = false)
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

        @Test
        void checkDropdownSorted() throws Throwable {
        getDriver("https://www.twoplugs.com/","chrome");
        driver.findElement(By.xpath("//*[text()='Live Posting']")).click();
            Select s=new Select(driver.findElement(By.name("category_id")));
//            s.selectByIndex(1);
//           // s.deselectByIndex(1);
//            s.selectByVisibleText("Automobile");
//          //  s.deselectByVisibleText("Automobile");
//            s.selectByValue("7");
//            s.selectByValue("7");

            List<WebElement> options=s.getOptions();
            List<String>origional=options.stream().map(e->e.getText()).collect(Collectors.toList());
            List<String>temp=origional.stream().sorted().collect(Collectors.toList());
//            List origionalList=new ArrayList();
//            List<String> tempList=new ArrayList();
//            for (WebElement option:options){
//                origionalList.add(option.getText());
//                tempList.add(option.getText());
//            }
//            System.out.println("original :"+origionalList);
//            System.out.println("temp :"+tempList);
//            Collections.sort(tempList);
//            System.out.println(" after sorted temp :"+tempList);
//            if(origionalList.equals(tempList)){
//                System.out.println("DropDown sorted");
//            }else {
//                System.out.println("DropDown unsorted");
//            }

            if(origional.equals(temp)){
                System.out.println("DropDown sorted");
            }else {
                System.out.println("DropDown unsorted");
            }
        }
}
