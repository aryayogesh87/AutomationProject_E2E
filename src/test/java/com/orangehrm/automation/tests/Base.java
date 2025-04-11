package com.orangehrm.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.lang.reflect.Method;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	protected WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeSuite
	public void setupReport() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Yogesh");
	}
	
	public WebElement waitForElement(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
		WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	    return wait.until(ExpectedConditions.visibilityOfElementLocated(element));	
	}

	@BeforeClass
	public void setupClass() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
	    driver = new ChromeDriver(options);
	}
	
	@BeforeMethod
	public void setupTest(Method method) {
	    test = extent.createTest(method.getName());
	}
	
	@AfterClass
	public void tearDown() {
	    if (driver != null) {
	        driver.quit();
	    }
	}

	@AfterSuite
	public void endReport() {
		extent.flush();
	}
}