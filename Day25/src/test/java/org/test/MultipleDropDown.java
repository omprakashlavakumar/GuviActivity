package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDown {
	public static void main(String[] args) {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
						
		// Maximize the Window
		driver.manage().window().maximize();
		
		// To launch the URL
		driver.get("https://demoqa.com/select-menu");
		
		// Locate the Drop Down Button
		WebElement dnd = driver.findElement(By.xpath("//select[@id='cars']"));
		
		// SELECT CLass
		// Select ref = new Select (Webelement Ref);
		Select select = new Select(dnd);
		
		// Check the Drop Down is Multiple
		boolean multiple = select.isMultiple();
		
		List<WebElement> allOptions = select.getOptions();
		
		if(multiple==true) {
		    for (WebElement eachOption : allOptions) {
			  String data = eachOption.getText();
			  select.selectByVisibleText(data);
		   }
		} else {
			select.selectByIndex(1);
		}
		
		// Deselect a option in the Drop down
		select.deselectByIndex(1);
		//select.deselectAll();
		
		// Getting the Selected Options in the Drop Down
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		// Getting the first selected Option in the Drop Down
		WebElement option = select.getFirstSelectedOption();
		System.out.println("1st Selected Option - "+option.getText());
		
		
	}

}
