package com.orangehrm.automation.listeners;

import com.orangehrm.automation.tests.Base;
import org.testng.*;

public class CustomListener implements ITestListener {

	@Override
    public void onTestStart(ITestResult result) {
        Base.test = Base.extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Base.test.pass("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Base.test.fail("Test failed: " + result.getName());
    }
}