package com.orangehrm.testng;

import org.testng.annotations.Test;

public class TestNGPriority {

    @Test
    public void test1(){
        System.out.println("I am in test1");
    }

    @Test
    public void test2(){
        System.out.println("I am in test2");
    }

    @Test
    public void test(){
        System.out.println("I am in test3");
    }

}
