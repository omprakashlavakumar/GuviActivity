package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) throws Exception {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
						
		// Maximize the Window
		driver.manage().window().maximize();
		
		// To launch the URL
		driver.get("https://www.amazon.in/");
		
		// Search the Item
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone",Keys.ENTER);
		
		// Click a Product
		WebElement firstItem = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (256 GB) - Black']"));
		firstItem.click();
		
		// Get the Parent Window ID
		String parentWindow = driver.getWindowHandle();
		
		// Get all the WINDOW ID
		Set<String> allWindow = driver.getWindowHandles();
			
	   // Create a List
		List<String> li = new ArrayList <String>();
		
		// Add List and Set
		li.addAll(allWindow);
		
		// Switching into the Window using Index
		String childOne = li.get(1);
		
		driver.switchTo().window(childOne);
		
		// Close the Child One Window
		driver.close();
		
		// Switch back to the Parent window 
		driver.switchTo().window(parentWindow);
		
		
	}

}
