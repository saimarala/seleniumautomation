package com.cloudtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserStackBaseTest {
    WebDriver driver;
    public static final String USERNAME = "saimarala1";
    public static final String AUTOMATE_KEY = "VRKsACqBfuqmQpcXsAV2";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    @Parameters({"browser", "browser_version", "os", "os_version"})
    @BeforeMethod
    public void setUp(String browserName, String browser_version, String os, String os_version,  Method name){
        System.out.println("browser name is : " + browserName);
        String methodName = name.getName();


        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os", os);
        caps.setCapability("os_version", os_version);
        caps.setCapability("browser_version", browser_version);
        caps.setCapability("name", methodName);

        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            caps.setCapability("browserName", "Chrome");
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            caps.setCapability("browserName", "Firefox");
        }

             try{
                 driver = new RemoteWebDriver(new URL(URL), caps);
                 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
             }catch (Exception e){
                 e.printStackTrace();
             }
        }
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }



    }

