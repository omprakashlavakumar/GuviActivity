package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {
	public static void main(String[] args) {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
						
		// Maximize the Window
		driver.manage().window().maximize();
						
		// To launch the URL
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	    email.sendKeys("CHENNAI@gmail.com");
	    
	    WebElement forgot = driver.findElement(By.linkText("Forgotten password?"));
	    forgot.click();
	    
	    // Previous Page
	    driver.navigate().back();
	    
	    // Goes Forward
	    driver.navigate().forward();
	    
	    // Previous Page
	    driver.navigate().back();
	    
	    // Refresh Page
	    driver.navigate().refresh();
	    
	    
	    
	}
}
