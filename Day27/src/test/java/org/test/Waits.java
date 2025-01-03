package org.test;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	public static void main(String[] args) {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
		
		// To launch the URL
		driver.get("https://www.bestbuy.com/");
		
		// Maximize the Window
		driver.manage().window().maximize();
		
		// PageLoad Timeout Wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//h4[text()='United States'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		// Explicit Wait
		
		// 1.Webdriver Wait
		/*
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Your list is currently empty']")));
		
		*/
		// 2. Fluent Wait
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver) // Declaring the Fluent Wait
				.withTimeout(Duration.ofSeconds(30))             // Duration to wait
				.pollingEvery(Duration.ofSeconds(1))             // Polling Frequency
				.ignoring(Exception.class);                      // Ignoring Timeout Exception
	
		WebElement until1 = wait1.until(new Function<WebDriver, WebElement>(){
			public WebElement apply (WebDriver driver) {
				return driver.findElement(By.xpath("//h3[text()='Your list is currently empty']"));
			}
		});
		
		String text1 = until1.getText();
		
		// Get the Text
		String text = driver.findElement(By.xpath("//h3[text()='Your list is currently empty']")).getText();
		System.out.println(text);
		System.out.println(text1);
		
	}

}
