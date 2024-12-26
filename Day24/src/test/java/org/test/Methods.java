package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods {
	public static void main(String[] args) throws Exception {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
						
		// Maximize the Window
		driver.manage().window().maximize();
						
		// To launch the URL
		driver.get("https://www.facebook.com/");
		
		// Get the Current URL
		String url = driver.getCurrentUrl();
		System.out.println("Current URL - "+ url);
		
		// Get the Title of the page
		String title = driver.getTitle();
		System.out.println("The Title - "+ title);
		
		// Get the Text from the Web Application
		WebElement ref = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String text = ref.getText();
		System.out.println("Get Text Method value - " + text);
		
		// Get the Value which is entering
		WebElement ref1 = driver.findElement(By.xpath("//input[@name='email']"));
		ref1.sendKeys("abcd@gmail.com");
		String attribute = ref1.getAttribute("value");
		System.out.println("Attribute sent - "+ attribute);
		
		Thread.sleep(5000);
		
		// To QUIT the Browser
		driver.quit();
	}

}
