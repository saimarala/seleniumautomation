package com.hrm.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.hrm.qa.base.TestBase;

public class TestUtil extends TestBase {
    public static long PAGE_LOAD_TIMEOUT = 200000;
    public static long IMPLICITY_WAIT = 200000;


    public static void takeScrenshotAtEndofTest() throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String CurrentDir = System.getProperty("user.dir");
        FileUtils.copyFile(src, new File(CurrentDir + "/scrennshots/" + System.currentTimeMillis() + ".png"));
    }


}
