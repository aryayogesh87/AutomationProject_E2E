package com.orangehrm.automation.utils;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="LoginData")
	
	public Object[][] getLoginData(){
		return new Object[][] {
			{"admin", "admin123"},
			{"user", "user123"}};	
	}
}