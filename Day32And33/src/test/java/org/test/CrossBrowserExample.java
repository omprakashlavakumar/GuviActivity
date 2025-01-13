package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserExample {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void setup (String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}	
	}

    @Test
	public void Test () {
    	// Maximize the Window
    			driver.manage().window().maximize();
    			
    			// To launch the URL
    			driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Example@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		
	}
	@AfterMethod
	public void afterClass () {
		driver.close();
	}

}
