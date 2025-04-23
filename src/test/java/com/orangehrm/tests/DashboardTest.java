package com.orangehrm.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.Base;
import com.listeners.CustomListener;

@Listeners(CustomListener.class)
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
