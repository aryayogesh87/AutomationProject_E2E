package com.orangehrm.automation.tests;

import org.testng.annotations.Test;

public class DashboardTest extends Base {

    @Test(groups = {"Regression", "Sanity"})
    public void checkWidgets() {
        System.out.println("Running Regression/Sanity - checkWidgets");
    }

    @Test
    public void logout() {
        System.out.println("Running logout - no group");
    }
}
