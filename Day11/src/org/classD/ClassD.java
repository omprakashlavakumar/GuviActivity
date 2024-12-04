package org.classD;

import org.classA.ClassA;

public class ClassD extends ClassA {
	public void manager () {
		System.out.println("Child Class manager Method");
	}
	
	public static void main(String[] args) {	
		// Hierachical Inheritance
		ClassD obj = new ClassD ();
		obj.employee();
		obj.manager();
		
	}

}
