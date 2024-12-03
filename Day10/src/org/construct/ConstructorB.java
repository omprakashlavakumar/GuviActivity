package org.construct;

public class ConstructorB extends ConstructorA  {
	public ConstructorB () {
		this(10);
		System.out.println("Default Constructor of B");	
	}	
	public ConstructorB (int a) {
		super();
		System.out.println("Parameter Constructor of B value :" + a);
	}
	public static void main(String[] args) {
		ConstructorB obj = new ConstructorB ();	
	}
}