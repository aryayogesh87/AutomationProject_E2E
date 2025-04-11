package com.orangehrm.automation.tests;

import org.testng.annotations.Test;

public class DoTest extends Base {

    @Test(groups = "Smoke")
    public void validLogin() {
        System.out.println("Running Smoke - validLogin");
    }

    @Test(groups = "Regression")
    public void invalidLogin() {
        System.out.println("Running Regression - invalidLogin");
    }
}
