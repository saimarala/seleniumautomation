package com.hrm.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.hrm.qa.util.TestUtil;
import com.hrm.qa.util.WebEventListner;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListner eventListner;
	//C:\selenium\SELENIUM_SCRIPT\Mavenproject\src\main\java\com\hrm\qa\config\config.properties
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\selenium\\SELENIUM_SCRIPT\\Mavenproject\\src\\main\\java\\com\\hrm\\qa\\config\\config.properties");
			//System.getProperty("user.dir")+"\\src\\main\\java\\com\\hrm\\qa\\config\\config.properties");
			prop.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

	public static  void initialization() {
		String browserName=prop.getProperty("browser");

		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");			
			driver=new ChromeDriver();
		}

		e_driver=new EventFiringWebDriver(driver);
		eventListner=new WebEventListner();
		e_driver.register(eventListner);
		driver=e_driver;



		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITY_WAIT, TimeUnit.MILLISECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.MILLISECONDS);
		//Log.info("app url is :"+prop.getProperty("url"));
	}


	public static void failed(String testMethodName) {
		try {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String CurrentDir=System.getProperty("user.dir");
			//FileUtils.copyFile(src,new File(CurrentDir+"/scrennshots/"+System.currentTimeMillis()+".png"));
			FileUtils.copyFile(src,new File(CurrentDir+"/scrennshots/"+testMethodName+"_"+System.currentTimeMillis()+".png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
