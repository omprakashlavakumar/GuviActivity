package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSample {
	public static void main(String[] args) {
		// launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
		// Launch the Firefox Browser
		// WebDriverManager.firefoxdriver().setup();
		
	    // Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the Window
		driver.manage().window().maximize();
		
		// To launch the URL
		driver.get("https://www.spicejet.com/");
		
		// Close the tab
		//driver.close();
		
		// Quit the entire browser
		driver.quit();
		
		System.out.println("Program Ran Successfully");
	}

}
