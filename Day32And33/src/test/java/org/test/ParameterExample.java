package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterExample {
	WebDriver driver;
	@BeforeMethod
	public void beforeClass () {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		driver = new ChromeDriver();
						
		// Maximize the Window
		driver.manage().window().maximize();
		
		// To launch the URL
		driver.get("https://www.facebook.com/");
	}
	 @Test
	 @Parameters({"user","pass"})
		public void Test (String user, String pass) throws Exception {
			driver.findElement(By.id("email")).sendKeys(user);
			driver.findElement(By.id("pass")).sendKeys(pass);
			Thread.sleep(5000);
		}
		@AfterMethod
		public void afterClass () {
			driver.close();
		}

}
