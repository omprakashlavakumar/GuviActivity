package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
	
	public static String screenShot (String name) throws IOException {
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
	
	public static String excelRead(String path, String sheet, int row, int cell) throws Exception {
		String value = null;
		File f = new File (path);
		FileInputStream fin = new FileInputStream (f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		value = getCellValueAsString(c);
		// value = c.getStringCellValue();
		System.out.println(c);
		return value;		
	}

	public static String getCellValueAsString(Cell c) {
       switch (c.getCellType()) {
            case NUMERIC:
               if (DateUtil.isCellDateFormatted(c)) {
                   return c.getDateCellValue().toString(); // For date values
              } else {
                   return String.valueOf(c.getNumericCellValue()); // For numeric values
              }
            case STRING:
                return c.getStringCellValue(); // For text values
            default:
                return "Unsupported Cell Type"; // For unsupported types
        }    
	}
	
	public static void excelWrite (String path, String sheet, int row, int cell, String value) throws Exception {
		File f = new File (path);
		FileInputStream fin = new FileInputStream (f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.createSheet(sheet);
		Row r = s.createRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(value);
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);	
	}
	
	

}
