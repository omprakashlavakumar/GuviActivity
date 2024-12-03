package org.test.Day09;

public class ClassB {
	public void detail () {
		System.out.println("Class B Functions");	
			
	}
	
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.customer();
		obj.employee();
		obj.customer();
		obj.age(45);
		obj.details(987654321,"Chennai");
		ClassB objB = new ClassB();
		objB.detail();
	}

}
/*
PRIVATE – Within the Class
PUBLIC – Everywhere
PROTECTED – Everywhere in Same Package and Inherited in Different Package (INHERITANCE)
DEFAULT – Same Package Alone
*/
