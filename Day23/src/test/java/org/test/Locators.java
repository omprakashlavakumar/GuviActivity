package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static void main(String[] args) throws Exception {
		// launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
						
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
				
		// Maximize the Window
		driver.manage().window().maximize();
				
		// To launch the URL
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		
		//Locators
		
		// 1. By ID
		WebElement byId = driver.findElement(By.id("customer.firstName"));
		byId.sendKeys("RAM");
		
		Thread.sleep(1000);
		
		// 2. By Name
		WebElement byName = driver.findElement(By.name("customer.lastName"));
		byName.sendKeys("Kumar");
		
		Thread.sleep(1000);
		
		// 3. By Tag Name
		WebElement byTag = driver.findElement(By.tagName("h1"));
		String text = byTag.getText();
		System.out.println(text);
		
		// 4. By Link Text 
		WebElement byLink = driver.findElement(By.linkText("Register"));
		String text2 = byLink.getText();
		System.out.println(text2);
		
	    // 5. By Partial Link Text
		WebElement byPartial = driver.findElement(By.partialLinkText("login info?"));
		byPartial.click();
		
		// 6. By Class Name
		WebElement byClass = driver.findElement(By.className("caption"));
		String text3 = byClass.getText();
		System.out.println(text3);
		
		// 7. By Xpath
		// Relative XPATH - //tagname[@attributename='attributevalue']
		WebElement xpath = driver.findElement(By.xpath("//input[@name='address.city']"));
		xpath.sendKeys("CHENNAI");
		
		// Absolute Xpath
		WebElement absolute = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/input"));
		absolute.sendKeys("TAMILNADU");
		
		// 8. CSS Selector
		WebElement cssID = driver.findElement(By.cssSelector("#firstName"));
		cssID.sendKeys("Anand");
		
		
			    
		
	}

}
