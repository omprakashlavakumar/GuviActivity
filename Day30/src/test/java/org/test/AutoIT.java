package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT {
	public static void main(String[] args) throws Exception {
		// launch the Chrome Browser
	    WebDriverManager.chromedriver().setup();
								
		// Created a Driver instance to access the browser
		WebDriver driver = new ChromeDriver();
						
		// Maximize the Window
		driver.manage().window().maximize();
		
		// To launch the URL
		driver.get("https://www.file.io/");
		
		driver.findElement(By.xpath("//label[@for='upload-button']")).click();
		
		Runtime.getRuntime().exec("E:\\FileUploadOne.exe");
		
		System.out.println("DONE");
		
		/*
		 * 1. Identify the actions you will be performing in Windows
		 * 2. Write the Script in au3 format
		 * 3. Convert that into exe file
		 * 4. Add/Execute the file in Selenium code
		 */
		
	}

}
