package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonAndCheckBox {
	public static void main(String[] args) throws Exception {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
						
		// Maximize the Window
		driver.manage().window().maximize();
						
		// To launch the URL
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(5000);
		// Locate the Radio Button
		WebElement radioButton = driver.findElement(By.xpath("//label[text()='Impressive']"));
		
		// Click the Radio Button
		radioButton.click();
		
		Thread.sleep(5000);
		
		// Checking the Radio Button is Selected or Not
		boolean radioCheck = radioButton.isSelected();
		if(radioCheck==true) {
		System.out.println("Radio Button is Selected");
		} else {
			System.out.println("Radio Button is Not Selected");
		}
		
		// Click the Check Box Menu
		WebElement checkMenu = driver.findElement(By.xpath("//span[text()='Check Box']"));
		checkMenu.click();
		
		driver.quit();
		
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver1 = new ChromeDriver();
						
		// Maximize the Window
		driver1.manage().window().maximize();
		
		// To launch the URL
		driver1.get("https://artoftesting.com/samplesiteforselenium");
		Thread.sleep(5000);
		
		// Locate the Check BOX
		WebElement checkBox = driver1.findElement(By.xpath("//input[@value='Automation']"));
		
		// Checking the Check Box is Selected or Not
		boolean checkBoxV = checkBox.isSelected();
		
		// If the Check Box Not Selected, Click the Check Box
		if(checkBoxV==false) {
			checkBox.click();
		}
		
		// Printing Whether the button is selected
		if(checkBoxV==true) {
		System.out.println("Check BOX is Selected");
		} else {
			System.out.println("Check BOX is Not Selected");
		}
		
		driver.quit();
		
		
	}

}
