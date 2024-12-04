package org.classB;
import org.classA.ClassA;

public class ClassB extends ClassA {
	public void customer () {
		System.out.println("Child Class Customer Method");
	}
	
	public static void main(String[] args) {	
		// Single Inheritance
		ClassB obj1 = new ClassB ();
		obj1.employee();
		obj1.customer();
		
	}

}
