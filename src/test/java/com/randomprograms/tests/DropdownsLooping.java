package com.randomprograms.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownsLooping {

	public static void main(String[] args) throws InterruptedException {

		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.quit();
		System.out.println("***********Program finished***********");
	}
}
