package org.Collections;

import java.util.Scanner;

public class AddOn {
	public static void main(String[] args) {
		
		// 2-D Array
		int a [][] = new int [2][2];
		a[0][0]=10;
		a[1][0]=20;
		a[0][1]=30;
		a[1][1]=40;
		System.out.println(a[1][0]);
		
		//Nester For Loop
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		/* 
		 * == Equal To
		 * != Not Equal To
		 * <= Less than or Equal to
		 * >= Greater than or Equal to
		 */ 
		
	  int b = 5;
	  if (b>=5) {
		System.out.println("Greater than or Equal to 5");
	} 
	  
	  // Scanner Class
	  Scanner sc = new Scanner(System.in);
	  String rev = "";
	  System.out.println("Enter the String to Reverse ");
	  String nextLine = sc.nextLine();
	  char ch1 = nextLine.charAt(2);
	  System.out.println(ch1);
	  // nextInt(); - To enter Int values
	  for (int i = nextLine.length()-1; i >=0; i--) {
		  char ch = nextLine.charAt(i);
		  rev = rev + ch;	
	}
	  System.out.println("Reversed String :" + rev);
	
		
		String s1 = "JAVA";
		String s2 = "java";
		String s3 = "Welcome to Java";
		String s4 = "";
		String s5 = "     Selenium";
		
		// Length of the String
		int i = s1.length();
		System.out.println(i);
		
		//Convert to Upper Case
		String upperCase = s2.toUpperCase();
		System.out.println(upperCase);
		
		//Convert to Lower Case
		String lowerCase = s1.toLowerCase();
		System.out.println(lowerCase);
		
		// Check whether the String is equal - Case Sensitive
		boolean equals = s1.equals(s2);
		System.out.println(equals);

		// Check whether the String is equal - Non-Case Sensitive
		boolean ignoreCase = s1.equalsIgnoreCase(s2);
		System.out.println(ignoreCase);
				
		// Remove the unused Space
		System.out.println(s5);
		System.out.println(s5.trim());
		
		// To remove Character in the front from the String
		String substring = s3.substring(3);
		System.out.println(substring);
		
		// To remove Character in the front & Back from the String
		String substring2 = s3.substring(3,7);
		System.out.println(substring2);
		
		// To check is Empty
		System.out.println(s4.isEmpty());
	}
	
	

}
