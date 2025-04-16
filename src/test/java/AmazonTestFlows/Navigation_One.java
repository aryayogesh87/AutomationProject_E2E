package AmazonTestFlows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automationProjectE2E.base.Base;
import com.orangehrm.automation.listeners.CustomListener;
import com.orangehrm.automation.tests.LoginTest;

@Listeners(CustomListener.class)
public class Navigation_One extends Base {

	@Test
	public void checkCRMLoginFunctionality() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		LoginTest login = new LoginTest(driver);
		Thread.sleep(2000);
		login.loginToApplication("Admin", "admin123");
		Assert.assertTrue(true);
		Thread.sleep(3000);
		driver.quit();
	}
}