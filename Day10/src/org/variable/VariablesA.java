package org.variable;

public class VariablesA {
	
	int b; //2. Instance Variable ---- Object Level Variable
	static String c; //3. Static Variable ---- Class Level Variable
	
	public void localVariable () {
		int a= 10; //1. Local Variable ---- Block Level Variable
		System.out.println("Local Variable : "+ a);
	}
	public static void main(String[] args) {
		VariablesA obj = new VariablesA ();
		obj.localVariable();
		// objectname.variablename --- Instance Variable
		System.out.println("Instance Variable : "+obj.b); 
		System.out.println("Static Variable : "+c);
	}
}
/*
Local Variable – Within the Method ( Block Level Variable)
Instance Variable – Inside the Class and Outside Method (Object Level Variable)
Static Variable - Inside the Class and Outside Method (Class Level Variable)
*/
