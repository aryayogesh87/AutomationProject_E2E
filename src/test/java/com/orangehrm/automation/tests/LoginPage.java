package com.orangehrm.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import com.orangehrm.automation.base.Base;
import com.orangehrm.automation.listeners.CustomListener;

@Listeners(CustomListener.class)
public class LoginPage extends Base {
	
	WebDriver driver;
		
	//CONSTRUCTOR
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}

	//LOCATORS
	By usernameField = By.xpath("//input[@name='username']");
	By passwordField = By.xpath("//input[@name='password']");	
	By loginButton 	 = By.xpath("//button[@type='submit' and contains(text(), 'Login')]");
	
	//ACTIONS
	public void getUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}
	
	public void getPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
	// Utility method to perform full login
	public void loginToApplication(String username, String password) {
		getUsername(username);
		getPassword(password);
		clickLogin();
		
	}
}