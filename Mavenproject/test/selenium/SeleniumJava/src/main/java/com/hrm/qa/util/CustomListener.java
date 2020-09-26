package com.hrm.qa.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.hrm.qa.base.TestBase;

public class CustomListener extends TestBase implements ITestListener {

    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestFailure(ITestResult result) {
        System.out.println("failed test");
        failed(result.getMethod().getMethodName());
        failed(result.getMethod().getMethodName());
        TestBase.failed(result.getMethod().getMethodName());

    }

    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub

    }

    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub

    }

}
