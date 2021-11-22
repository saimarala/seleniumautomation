package com.hrm.qa.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int counter=0;
    int retryLimit=3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(counter<retryLimit){
            return true;
        }
        return false;
    }
}
