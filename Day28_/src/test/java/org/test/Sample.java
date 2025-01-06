package org.test;

import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {
	public static void main(String[] args) {
		browserConfigChrome();
		openURL("https://www.facebook.com/");
		maximizeWindow();
		WebElement search = locateByXpath("//input[@type='text']");
		textInput(search, "xyz@gmail.com");	
		WebElement button = locateByXpath("//button[@name='login']");
		click(button);	
	}

}
