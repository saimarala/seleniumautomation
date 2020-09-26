package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {

	public static void main(String[] args)throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
			Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.MILLISECONDS);
		
		
		//checkboxes
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//*[@type='checkbox']"));
		
		for(WebElement checkbox:checkboxes) {
			
			if(checkbox.getAttribute("name").contains("StudentDiscount")) {
				checkbox.click();
				break;
			}
		}
		//radio buttons
		List<WebElement> radioList=driver.findElements(By.xpath("//*[@type='radio']"));
		
		for(WebElement radio:radioList) {
			System.out.println("text :"+radio.getText());
			if(radio.getAttribute("value").equalsIgnoreCase("OneWay")) {
				if(radio.isSelected()) {
					System.out.println("is already selected");
					break;
				}else {
					radio.click();
					break;
					
				}
			}
				
			}
		
		Thread.sleep(2000);
		//dropdown
		
		
		
		List<WebElement>droplists=driver.findElements(By.xpath("//*[@type='hidden']"));
		
		System.out.println(droplists.size());
		for(WebElement dropDwond:droplists) {
			System.out.println("dropDown:"+dropDwond.getText());
			if(dropDwond.getAttribute("value").equalsIgnoreCase("(BLR)")) {
				dropDwond.click();
				break;
			}
		}
		//month 
		//WebElement e=driver.findElement(By.xpath("(//*[@type='button'])[1][@class='ui-datepicker-trigger']"));
		WebElement e1=driver.findElement(By.xpath("(//*[@type='text'])[1]"));
		Actions a=new Actions(driver); 
		a.moveToElement(e1).click().build().perform();
		Thread.sleep(2000);
		//calender
		String expmonth="August";
		int expyear=2019;
		for(int i=0;i<12;i++) {
		String month=driver.findElement(By.xpath("(//span[@class='ui-datepicker-month' ])[1]")).getText();
		String year=driver.findElement(By.xpath("(//*[@class='ui-datepicker-year'])[last()-1]")).getText();
		if(month.equalsIgnoreCase(expmonth) && year.equalsIgnoreCase(String.valueOf(expyear))) {
			break;
		}else {
			//driver.findElement(By.xpath("//*[@title='Next']")).click();
			driver.findElement(By.linkText("Next")).click();
		}
		}
		
		List<WebElement> dates=driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar']/tbody)[1]//tr//td//a"));
		
		for(WebElement date:dates) {
			if(date.getText().equalsIgnoreCase("20")) {
				date.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
