package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	
	public static void browserConfigChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void openURL(String url) {
		driver.get(url);
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static WebElement locateByXpath (String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;	
	}
	
	public static WebElement locateByID (String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;	
	}
	
	public static void textInput (WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void click (WebElement element) {
		element.click();
	}
	
	public static void refresh () {
		driver.navigate().refresh();
	}
	
	public String screenShot (String name) throws IOException {
		// Screenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver; // Typecast
		// Method to take Screenshot - Stored in a temproary location
		File src = screenshot.getScreenshotAs(OutputType.FILE); 
		// Place to store Permanent Location
		File dest = new File ("C:\\Users\\Om Prakash\\eclipse-workspace\\Day29\\Screenshot\\"+name+".jpg"); 
		// Copying from Temp loc to Per Loc (From Source to Destination)
		// Syntax - FileUtils.copyFile(src,dest);
		FileUtils.copyFile(src,dest);
		return name;
	}
	
	

}
