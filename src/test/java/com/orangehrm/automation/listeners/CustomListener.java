package com.orangehrm.automation.listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter {
    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.println("\u001B[32m✔ Test Passed: " + tr.getName() + "\u001B[0m");
    }
}
