package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {

	public static void main(String[] args) throws Exception {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
						
		// Maximize the Window
		driver.manage().window().maximize();
						
		// To launch the URL
		driver.get("https://www.spicejet.com/");
		
		// Create the Object for the Actions Class
		Actions act = new Actions(driver);
		
		// Get the webelement ref to do mouse over
		WebElement ref = driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8'])[2]"));
		
		// Method to do Mouse Over
		act.moveToElement(ref).perform();
		
		// //tagname[text()='textvalue']
		WebElement ref1 = driver.findElement(By.xpath("(//div[text()='SpiceMax'])[1]"));
		act.doubleClick(ref1).perform();
		// ref1.click(); //Left Click
		
		Thread.sleep(10000);
		
		// Get the Current URL
		String url = driver.getCurrentUrl();
		System.out.println("Current URL - "+ url);
		
		WebElement ref2 = driver.findElement(By.xpath("//div[text()='Hotels']"));
		
		// Context Click ---> Right Click
		act.contextClick(ref2).perform();
		
	}

}
