package org.test;

import org.openqa.selenium.WebElement;

public class SampleExcel extends BaseClass {
	public static void main(String[] args) throws Exception {
		browserConfigChrome();
		openURL("https://www.facebook.com/");
		maximizeWindow();
		WebElement search = locateByXpath("//input[@type='text']");
		textInput(search, excelRead("C:\\Users\\Om Prakash\\eclipse-workspace\\Day29\\Excel\\TestDataFB.xlsx","Sheet1",0,0));	
		screenShot("One");
		WebElement textC = locateByXpath("//h2[text()='Facebook helps you connect and share with the people in your life.']");
		String text = textC.getText();
		excelWrite("C:\\Users\\Om Prakash\\eclipse-workspace\\Day29\\Excel\\TestDataFB.xlsx","Data",1,1,text);
		System.out.println("DONE");
	}

}
