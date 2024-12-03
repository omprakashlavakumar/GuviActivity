package org.variable;

public class VariableB {
	
	public static void main(String[] args) {
		VariablesA obj = new VariablesA ();
		// objectname.variablename --- Instance Variable
		System.out.println("Instance Variable : "+obj.b); 
		// classname.variablename --- Static Variable
		System.out.println("Static Variable : "+ VariablesA.c);
		
	}

}
