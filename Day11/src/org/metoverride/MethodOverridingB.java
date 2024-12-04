package org.metoverride;
public class MethodOverridingB extends MethodOverridingA {

	//Runtime Polymorphism (Method Overriding/Dynamic Polymorphism)
	public void savings () {
		float a = 3.5f;
		System.out.println("Overrided Savings Account Interest Rate :"+a);
	}
	public void fd () {
		super.fd(); // To get the parent method functions
		System.out.println("Overriding FD Method");
	}
		
	public static void main(String[] args) {
		MethodOverridingB obj = new MethodOverridingB ();	
		obj.savings();
		obj.fd();
	}
}
/*
Different Class
Same Method Name
Same Argument
*/
