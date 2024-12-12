package org.exception;

public class ExceptionHandling {
	
	public static void main(String[] args) throws InterruptedException   {
		int a = 10;
		//Unchecked Exception
		//1. Arithmetic Exception
		try {               // It will try and see if there any error. If yes it will go to Catch block, if not it will execute
			int b = a/0;
			System.out.println("Divided Value :" +b);
		} catch (ArithmeticException e) { // If there is error in try block this will execute if not it will be skipped
			System.out.println("Exception Type: "+e);
		} finally {               // Regardless of the error it will execute
			System.out.println("Exception Handling is Used if there is any");
		}
		 
		//2. Null  Pointer Exception
		String s = null;
		String s1 = "";
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Exception Type: "+e);
		}finally {
			System.out.println("Exception Handling is Used if there is any");
		}
		
		//3.ArrayIndexOutOFBoundException
		int ar [] = new int [3];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		try {
			ar[3]=40;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Type: "+e);
		}
		
		//4. Number Format Exception
		String str = "JAVA";
		String str1 = "123";
		try {
			int num = Integer.parseInt(str); // Convert String (that are numbers) into Integer
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Exception Type: "+e);
		}
		
		// Checked Exception - InterruptedException
		Thread.sleep(1000); 
		
		// throw keyword - Custom Exception
		int age = 15;
	
		if (age<18) {
			throw new IllegalArgumentException ("Age is Not Valid. Not less than 18");
		}else {
		    System.out.println("Age is Valid");
		}
		
		
		
		
		System.out.println("Mandatory Step to Execute regardless of Exception");
	}

}
