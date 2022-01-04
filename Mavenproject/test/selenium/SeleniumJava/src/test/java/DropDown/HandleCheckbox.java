package DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class HandleCheckbox {

    @Test
    void validateCheckbox(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        List<WebElement>checkboxes=driver.findElements(By.xpath("//*[@type='checkbox' and contains(@id,'day')]"));

//        for(WebElement checkbox:checkboxes){
//            checkbox.click();
//        }
//        for (WebElement checkbox:checkboxes){
//            String checkboxname=checkbox.getAttribute("id");
//            if (checkboxname.equalsIgnoreCase("wednesday") || checkboxname.equalsIgnoreCase("saturday")){
//                checkbox.click();
//            }
//        }

        //First two checkboxes
//        for (int i=0;i<checkboxes.size();i++){
//            if(i<2){
//                checkboxes.get(i).click();
//            }
//        }

        //Last two checkboxes
        for (int i=checkboxes.size()-2;i<checkboxes.size();i++){
            checkboxes.get(i).click();
        }

    }
}
