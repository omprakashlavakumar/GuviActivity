package org.test.Day09;

public class ClassA {
	private void admin () {
		System.out.println("admin Name");
	}
	
	protected void employee () {
		System.out.println("Employee ID");
	}
	
	void customer () { // Default Access Specifier
		System.out.println("Customer Address");	
	}
	           //    Argument
	public void age (int age) {
		System.out.println("Age of the Customer:" + age);	
	}
	
	public void details (int a, String b) {
		System.out.println("Customer Phone No :" + a);	
		System.out.println("Customer Address :" + b);		
	}
	
	public static void main(String[] args) {
	// ClassName Referenceobjectname = new classname ();
		ClassA obj = new ClassA ();
	// objectname.methodname();
		obj.customer();
		obj.employee();
		obj.admin();
		obj.customer();
		obj.age(45);
		obj.details(987654321,"Chennai");
	}
	
	// Scanner Class - Get the Input from the User	
		
}
