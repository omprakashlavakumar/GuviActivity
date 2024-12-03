package org.construct;

public class ConstructorA {
	public ConstructorA () {
		this(10);
		System.out.println("Default Constructor of A");	
	}
	
	public ConstructorA (int a) {
	    //this();
		System.out.println("Parameter Constructor of A value :" + a);
	}
	
	public static void main(String[] args) {
	   // ConstructorA obj = new ConstructorA ();
	  	ConstructorA obj1 = new ConstructorA (50);
	}
	

}
