package org.encapsule;

public class EncapsulationB extends EncapsulationA {
	public static void main(String[] args) {
		EncapsulationB obj = new EncapsulationB ();
		obj.setName("RAM");
		obj.setAge(32);
		System.out.println("Name :" + obj.getName());
		System.out.println("Age :" + obj.getAge());
		
	}

}
