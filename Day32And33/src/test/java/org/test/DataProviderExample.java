package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {

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

    @DataProvider(name = "loginData")
    public Object[][] dataProvider() {
        return new Object[][] {
                {"user1@example.com", "password1"},
                {"user2@example.com", "password2"},
                {"user3@example.com", "password3"}
        };
    }

    @Test(dataProvider = "loginData")
	public void Test (String user, String pass) {
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		//driver.findElement(By.id("u_0_5_IX")).click();
	}
	@AfterMethod
	public void afterClass () {
		driver.close();
	}
}
