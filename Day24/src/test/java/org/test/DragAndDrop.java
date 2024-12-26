package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	public static void main(String[] args) throws Exception {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
						
		// Maximize the Window
		driver.manage().window().maximize();
						
		// To launch the URL
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		// Create the Object for the Actions Class
		Actions act = new Actions(driver);
		
		// Webelement of drag 1
		WebElement dragref1 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
			
		// Webelement of Drop 1
		WebElement dropref1 = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		
		// Webelement of drag 2
		WebElement dragref2 = driver.findElement(By.xpath("(//*[@id=\"fourth\"]/a)[1]"));
		
		// Webelement of Drop 2
		WebElement dropref2 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		// DRAG and DROP 1
		act.dragAndDrop(dragref1,dropref1).perform();
		
		Thread.sleep(5000);
		
		// DRAG and DROP 2
		act.dragAndDrop(dragref2,dropref2).perform();
		
		
		
	}

}
