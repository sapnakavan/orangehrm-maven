package com.orangehrm.testng;

import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {

    @Test
    public void test1(){

    }

    @Test
    public void test2(){

    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void test3(){

    }

}
