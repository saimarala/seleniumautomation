package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class DatePicker {

    @Test
    void validateDate() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@for='onward_cal']")).click();

       //String mon=monthYear.split(" ")[0];
      //  String year=monthYear.split(" ")[1];

     while (true){
         String monthYear=driver.findElement(By.xpath("//*[@class='monthTitle']")).getText();
         String arr[]=monthYear.split(" ");
         String mon=arr[0] ,yrr=arr[1];
         if(mon.equalsIgnoreCase("oct") && yrr.equalsIgnoreCase("2021"))
             break;
         else
             driver.findElement(By.xpath("//*[text()='>']")).click();
     }
     //Date selection

        List<WebElement> allDates=driver.findElements(By.xpath("//*[@class='wd day' or @class='we day']"));
        for (WebElement ele :allDates){
            if(ele.getText().equals(Integer.toString(1))){
                ele.click();
                break;
            }
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
