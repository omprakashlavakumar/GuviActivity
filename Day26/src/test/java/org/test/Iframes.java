package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {
	public static void main(String[] args) {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
						
		// Maximize the Window
		driver.manage().window().maximize();
		
		// To launch the URL
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		// Getting Number of Iframes present
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		int size = elements.size();
		System.out.println("Iframe Count - "+ size);
		
		// Enter into the Iframe using Index
		driver.switchTo().frame(0);
		
		// Perform actions inside the Iframe
		WebElement ref = driver.findElement(By.xpath("//input[@type='text']"));
		ref.sendKeys("Sample");
		
		// Coming out of the Iframe
		driver.switchTo().defaultContent();
		
		// Click Multiple Iframe Page
		WebElement multipleFrame = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	    multipleFrame.click();
	    
	    // Enter into the Iframe using Webelement Reference
	    WebElement frame2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	    driver.switchTo().frame(frame2);
	    
	    // Perform actions inside the Iframe
	 	WebElement ref1 = driver.findElement(By.xpath("//input[@type='text']"));
	 	ref1.sendKeys("Sample");
	 	
	   // Coming out of the Iframe
	   driver.switchTo().defaultContent();
		
		
		
		
	}

}
