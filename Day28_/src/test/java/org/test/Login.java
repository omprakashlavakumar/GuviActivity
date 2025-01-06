package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass{
	 public Login(){
		PageFactory.initElements(driver,this);
	 }
	 
	 @FindBys({  //  AND Operator - Both conditions need to correct
		 @FindBy(id="email"),  // Correct
		 @FindBy(xpath = "//input[@type='text']")	// Correct
	 })
	 private WebElement email; 
	 /*
	 @FindBy(xpath = "//input[@type='text']")
	 private WebElement email;
	 */
	 @FindAll({  // OR Operator - Any One Condition Need to be correct
		 @FindBy(id="pass"),            // Correct
		 @FindBy(id="password")         // Incorrect
	 })
	 private WebElement pass;
	/*
	 @FindBy(id="pass")
	 private WebElement pass;
	 */
	 @FindBy(xpath="//button[@name='login']")
	 private WebElement loginBtn;
	 
	 public WebElement getEmail() {
			return email;
		}
		public WebElement getPass() {
			return pass;
		}
		public WebElement getLoginBtn() {
			return loginBtn;
		}
	 

}
