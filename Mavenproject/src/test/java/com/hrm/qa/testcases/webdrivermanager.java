package com.hrm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivermanager {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
//		//WebDriverManager.chromedriver().version("2.36").setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		System.out.println("opened");
//		driver.quit();
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println("opened");
		driver.quit();
	}

}
//driver.get("https://www.google.com/");
//System.out.println("opened");
//driver.quit();