package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlert {
	public static void main(String[] args) {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
						
		// Maximize the Window
		driver.manage().window().maximize();
		
		// To launch the URL
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Click Sign In Button
		WebElement sign = driver.findElement(By.xpath("//input[@type='submit']"));
		sign.click();
		
		// Switching to Alert and Accepting
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
