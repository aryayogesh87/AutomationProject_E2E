package com.randomprograms.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//*[@id='ui-id-1']"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India"))
				;
			option.click();
			break;
		}
	}
}