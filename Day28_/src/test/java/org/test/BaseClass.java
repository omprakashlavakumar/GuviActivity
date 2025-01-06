package org.test;

import org.openqa.selenium.By;
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
	
	

}
