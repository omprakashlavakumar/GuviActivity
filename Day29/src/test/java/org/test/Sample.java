package org.test;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {
	public static void main(String[] args) throws Exception {
		browserConfigChrome();
		openURL("https://www.facebook.com/");
		maximizeWindow();
		screenShot("One");
        /*
		// Screenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver; // Typecast
		// Method to take Screenshot - Stored in a temproary location
		File one = screenshot.getScreenshotAs(OutputType.FILE); 
		// Place to store Permanent Location
		File fileOne = new File ("C:\\Users\\Om Prakash\\eclipse-workspace\\Day29\\Screenshot\\1.jpg"); 
		// Copying from Temp loc to Per Loc (From Source to Destination)
		// Syntax - FileUtils.copyFile(src,dest);
		FileUtils.copyFile(one,fileOne);
		*/
		
		WebElement search = locateByXpath("//input[@type='text']");
		textInput(search, "xyz@gmail.com");	
		WebElement button = locateByXpath("//button[@name='login']");
		
		/*
		// Method to take Screenshot - Stored in a temproary location
		File two = screenshot.getScreenshotAs(OutputType.FILE); 
		// Place to store Permanent Location
		File fileTwo = new File ("C:\\Users\\Om Prakash\\eclipse-workspace\\Day29\\Screenshot\\2.jpg"); 
		// Copying from Temp loc to Per Loc
		FileUtils.copyFile(two,fileTwo);
		*/
		screenShot("Two");
		click(button);	
	}

}
