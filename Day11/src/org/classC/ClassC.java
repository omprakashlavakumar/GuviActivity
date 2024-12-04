package org.classC;

import org.classB.ClassB;

public class ClassC extends ClassB {
	public void admin () {
		System.out.println("Sub-Child Class Method Method");
	}
	
	public static void main(String[] args) {	
		// Multilevel Inheritance
		ClassC obj = new ClassC ();
		obj.employee();
		obj.customer();
		obj.admin();
		
	}

}
