package org.test.day08;

import java.util.Iterator;

public class ClassA {
	public static void main(String[] args) { //type main and press ctrl + space button
		//Primitive Datatypes
		byte a = 59;
		short b = 3457;
		int c = 86348309;
		long d = 734925437923553l;
		float e = 46383.5732937f;
		double f = 4269825462.457629535;
		char g = 'G';
		boolean h = false;
		
		// Non-Primitive Datatypes
		String s = "Class";
		
		short [] br = new short [4];
		br[0]=10;
		br[1]=20;
		br[2]=30;
		br[3]=40;
		System.out.println("Value of 3rd is " + br[2]);
		// Normal For Loop - This is Index Based
		//        1          2          4
		for (int i = 0; i < br.length; i++) {
			//                              3
			System.out.println("Printing All value of Short Array: " + br[i]);
		}		
		//   1       2       3      4
		//  i=0     i<4      +     i=1
	    //  i=1     i<4      +     i=2
	    //  i=2     i<4      +     i=3
	    //  i=3     i<4      +     i=4
	    //  i=4     i<4      -     
		 
		//Enhanced For Loop - This Value based
		for (short t : br) {
			System.out.println("Printing All value of Short Array through Enhanced For Loop: " + t);
		}
			
		// 0 1 2 3 4 5 6 7 8 9 10 11 - Index
		int [] ar = {10,20,30,500,60,70,45,34};
		int len = ar.length;
		System.out.println("Length of the Int Array is " + len);
		System.out.println("value of the Int Array 5th is " + ar[4]);
		
		// Normal For Loop - In Reverse Order
		for (int i = ar.length-1; i >= 0 ; i--) {
			System.out.println("Int Array Values through Normal For Loop: " + ar[i]);
		}
		// Enhanced For Loop
		for (int i : ar) {
			System.out.println("Int Array values through Enhanced For Loop: " + i);			
		}
		
		
		System.out.println("Byte Datatype value is " + a); //type sysout and press ctrl + space button
		System.out.println("Short Datatype value is " + b);
		System.out.println("Int Datatype value is " + c);
		System.out.println("Long Datatype value is " + d);
		System.out.println("Float Datatype value is " + e);
		System.out.println("Double Datatype value is " + f);
		System.out.println("Character Datatype value is " + g);
		System.out.println("Boolean Datatype value is " + h);
		System.out.println("String Datatype value is " + s);
		
	}
}
