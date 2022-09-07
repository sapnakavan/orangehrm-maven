package com.orangehrm.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

    private int retryCount = 0;
    public static final int maxRetryCount = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount<maxRetryCount){
            retryCount++;
            return true;
        }
        return false;
    }
}
