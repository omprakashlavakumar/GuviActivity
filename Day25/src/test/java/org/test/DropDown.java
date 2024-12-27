package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
						
		// Maximize the Window
		driver.manage().window().maximize();
		
		// To launch the URL
		driver.get("https://demo.automationtesting.in/Register.html");
		
		// Locate the Drop Down Button
		WebElement dnd = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		// SELECT CLass
		// Select ref = new Select (Webelement Ref);
		Select select = new Select(dnd);
		
		// Selecting the Option in the drop down using index
		//select.selectByIndex(1);
		
		// Selecting the option in the drop down using Value
		//select.selectByValue("Adobe Photoshop");
		
		// Selecting the option in the drop down using Visible Text
		//select.selectByVisibleText("Backup Management");
		
		// Print All the Options in the Drop Down
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for (int i = 0; i < options.size(); i++) {
			// getting Each Option
			WebElement eachOption = options.get(i);
			// Getting the text from that option
			String data = eachOption.getText();
			System.out.println(data);
		}
		
		
		
	}

}
