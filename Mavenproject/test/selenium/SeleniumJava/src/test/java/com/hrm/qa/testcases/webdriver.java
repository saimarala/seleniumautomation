package com.hrm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriver {

    @Test
    public void start() {
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
        //WebDriverManager.chromedriver().version("2.36").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("opened");
        driver.quit();
    }

}
