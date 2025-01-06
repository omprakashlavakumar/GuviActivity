package org.test;

public class Facebook extends BaseClass {
	public static void main(String[] args) {
		browserConfigChrome();
		openURL("https://www.facebook.com/");
		maximizeWindow();
		Login l = new Login ();
		textInput (l.getEmail(), "xyz@gmail.com");
		refresh();
		textInput (l.getEmail(), "abcd@gmail.com");
		textInput (l.getPass(), "12345678");
		click(l.getLoginBtn());
		
		System.out.println("Program Ran Successfully");
	}

}
