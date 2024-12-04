package org.metoverload;

public class MethodOverLoading {
	// Compile-Time Polymorphism (Method Overloading/Static Polymorphism)
	// 1. Arguments depends on datatype
	public void method (String s) {
		System.out.println("Method with String Argument :" +s);
	}
	public void method (int a) {
		System.out.println("Method with Int Argument :" +a);
	}
	// 2. Arguments depends on datatype Count
    public void method (int a, String s) {
	    System.out.println("Method with Int & String Argument :"+a+s);
	}
	public void method (int a, String s, char ch) {
		System.out.println("Method with Int, String & Char Argument :" + a + s + ch);
	}
	// 3. Arguments depends on datatype Order
	public void method (char ch, String s) {
		System.out.println("Method with Char & String Argument :"+ch+s);
	}
	public void method (String s, char ch) {
		System.out.println("Method with String & Char Argument :" + s + ch);
	}
	
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading ();
		obj.method(10);
		obj.method("Java");
		obj.method(20,"Java");
		obj.method(30,"Java",'A');
		obj.method('B',"Java");
		obj.method("JAVA",'B');
	}
}
/*
Same Class
Same Method Name
Different Argument

Arguments depends on datatype
Arguments depends on datatype Count
Arguments depends on datatype Order
*/
