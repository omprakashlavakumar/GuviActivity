package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {
	
public static void main(String[] args) throws Exception {
	    // launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
				
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the Window
		driver.manage().window().maximize();
		
		// To launch the URL
	    driver.get("https://parabank.parasoft.com/parabank/register.htm");
	    
	    // Enter the Value in the Field
	    WebElement firstName = driver.findElement(By.xpath("//input[@id='customer.firstName']"));
	    firstName.sendKeys("RAM");	 
	    
	    WebElement lastName = driver.findElement(By.xpath("//input[@id='customer.lastName']"));
	    lastName.sendKeys("KUMAR");
	   
	    WebElement address = driver.findElement(By.xpath("//input[@name='customer.address.street']"));
	    address.sendKeys("CMBT");
	    
	    WebElement city = driver.findElement(By.xpath("//input[@id='customer.address.city']"));
	    city.sendKeys("CHENNAI");
	  
	    WebElement state = driver.findElement(By.xpath("//*[@id='customer.address.state']"));
	    state.sendKeys("TN");
	    
	    WebElement zip = driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
	    zip.sendKeys("678890");
	    
	    WebElement phone = driver.findElement(By.xpath("//input[@id='customer.phoneNumber']"));
	    phone.sendKeys("9876543210");
	    
	    WebElement ssn = driver.findElement(By.xpath("//input[@id='customer.ssn']"));
	    ssn.sendKeys("0985671");
	    
	    WebElement user = driver.findElement(By.xpath("//input[@id='customer.username']"));
	    user.sendKeys("RAMKUMAR");
	    
	    WebElement pass = driver.findElement(By.xpath("//input[@id='customer.password']"));
	    pass.sendKeys("password123");
	    
	    WebElement confirm = driver.findElement(By.xpath("//input[@id='repeatedPassword']"));
	    confirm.sendKeys("password123");
	    
	    //Waits
	    Thread.sleep(10000);
	  
	    // Click the element
	    WebElement registerButton = driver.findElement(By.xpath("//input[@value='Register']"));
	    registerButton.click();  
	     
	   // Quit the entire browser
	 	driver.quit();
	    
}
}
