package switchTo;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Testbase.testBase;
import util.TestUtils;

public class getWindowHandlers extends testBase{
	//public static WebDriver driver;
	//public static TestUtils.driver;
	public static void main(String[] args) throws Throwable{
		
//		Properties prop=new Properties();
//		FileInputStream fis=new FileInputStream("C:\\selenium\\SELENIUM_SCRIPT\\MyProject\\src\\properties\\Config.properties");
//		prop.load(fis);
//		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
//		
//		driver=new ChromeDriver();
//		
//		driver.get("http://www.popuptest.com/");
		
		TestUtils.getDriver("http://www.popuptest.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.linkText("Multi-PopUp Test")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		System.out.println(handles.size());
		Iterator<String>it=handles.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(child);
		driver.switchTo().window(parent);
		System.out.println(parent);
		System.out.println("start:"+driver.getCurrentUrl());
		System.out.println("***********");
		for(String childs:handles) {
			
			driver.switchTo().window(childs);
//			if(driver.getCurrentUrl().equalsIgnoreCase("http://www.popuptest.com/popup4.html")) {
//				System.out.println(driver.getCurrentUrl()+":"+driver.getTitle());
//				break;
//			}
			System.out.println(driver.getCurrentUrl());
		}
		System.out.println("***********");
		TestUtils.switchToWindow("http://www.popuptest.com/popup4.html");
		TestUtils.switchToWindow("http://www.popuptest.com/popuptest1.html");
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		driver.quit();
	}
	


}
