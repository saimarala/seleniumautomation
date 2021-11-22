package com.hrm.qa.util;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerAdapter extends TestListenerAdapter {


    public void onTestFailure(ITestResult tr) {
        System.out.println("sss");
    }
}
