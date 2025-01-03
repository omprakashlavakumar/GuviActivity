package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmAndPromptAlert {
	public static void main(String[] args) throws Exception {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
						
		// Maximize the Window
		driver.manage().window().maximize();
		
		// To launch the URL
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		// 1. Confirm Alert
		//Click the Confirm ALert Option
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		
		// Pressing the Cancel Button in the Alert
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		// Static Wait
		Thread.sleep(3000);
		
		// 2. Prompt Alert
		// Click the Prompt Alert Option
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		
		// Sending the Value in the Text field and Accepting
		alert.sendKeys("Sample");
		alert.accept();
		
		
		
		
		
	}

}
