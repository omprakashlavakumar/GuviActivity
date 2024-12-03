package org.test;

// import packageName.ClassName; -- Import the Function of the class from different package
import org.test.Day09.ClassA;
import org.test.Day09.ClassB;

public class ClassC {
	public void classCDetail () {
		System.out.println("Class C Functions");	
			
	}
	
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.age(45);
		obj.details(987654321,"Chennai");
		ClassB objB = new ClassB();
		objB.detail();
		ClassC objc = new ClassC();
		objc.classCDetail();
	}
	
}
/*
PRIVATE – Within the Class
PUBLIC – Everywhere
PROTECTED – Everywhere in Same Package and Inherited in Different Package (INHERITANCE)
DEFAULT – Same Package Alone
*/