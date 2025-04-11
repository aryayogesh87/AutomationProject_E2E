package com.orangehrm.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.orangehrm.automation.listeners.CustomListener;

@Listeners(CustomListener.class)
public class LoginTest extends Base {

	@Test(priority = 0)
	public void Logintest() {
		System.out.println("Login Test");
		
		By username = By.xpath("//input[@name='username']");
		WebElement usernameField = waitForElement(username);
		usernameField.sendKeys("Admin");
		
		waitForElement(username);
		
		By password = By.xpath("//input[@name='password']");
		((WebElement) password).sendKeys("admin123");
		
		waitForElement(password);

		driver.findElement(By.xpath("//button[@type='submit' and contains(text(), 'Login')]")).click();
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		String title = driver.getTitle();
//		driver.manage().window().maximize();
//		Assert.assertEquals(title, "OrangeHRM");
	}

	@Test(priority = 1)
	public void DashboardTest() {
		System.out.println("Dashboard Test");
	}

	@Test(priority = 2)
	public void launchApp() {
		System.out.println("Launch Application");
	}

}