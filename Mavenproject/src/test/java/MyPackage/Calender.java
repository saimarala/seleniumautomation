package MyPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws Throwable{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.MILLISECONDS);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'DEPARTURE')]")).click();
		
		//String month=driver.findElement(By.xpath("//*[@class='datePickerContainer']")).getText();
		String expmonth="August 2019";
		
		
		List<WebElement> month=driver.findElements(By.xpath("//*[@class='datePickerContainer']"));
		System.out.println(month.size());
		for(WebElement months:month) {
			String cMonth=months.getText();
			if(cMonth.equals(expmonth)) {
				driver.findElement(By.xpath("//*[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				break;
			}else {
				driver.findElement(By.xpath("//*[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}
		
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
