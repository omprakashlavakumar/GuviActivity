package org.day09;

public class ClassA {
	public static void main(String[] args) {
		//Conditional Statement
		
		//1. If Statement
		int a = 5;
		if (a==5) {
			System.out.println("The Number is Five");
		}
		
		//2. If Else Statement
		int b = 1;
		if (b==10) {
			System.out.println("The Number is Ten");
		} else {
			System.out.println("The Number is Not Ten");
		}
		
		//3. If Else Ladder
		int c = 30;
		if (c==20) {
			System.out.println("The Number is Twenty");
		} else if (c==30) {
			System.out.println("The Number is Thirty");
		} else {
			System.out.println("The Number is Not Twenty or Thirty");
		}
		
		//4. Switch Condition
		int weekDay = 2;
		
		switch (weekDay) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Not a Valid Day");
			break;
		}
		
		// Looping Statements
		// 1. For Loop
		//        1        2     4
		for (int e = 0; e <=10; e++) {
			//        3
			System.out.println(e);
		}
		
		// 2. While Loop
		//    1
		int f = 5;
		//     2
		while (f < 10) {
			//      3
			System.out.println(f);
			// 4
			f ++;		
		}
	// Infinite Loop
	//	while (true) {
	//		System.out.println("It is infinte loop since the condition doesn't fail");
	//	}
		
		// 3. Do while Loop
		//    1
		int g = 8;
		 do {
			 //  3
			 System.out.println(g);
			 // 4
			 g++;
			//     2
		} while (g <= 20);
		 
		 // 4. Nested For Loop
		 //        1       2      4
		 for (int i = 0; i < 2; i++) {
			 //         3
			 //        1A      2A    4A
			 for (int j = 0; j < 2; j++) {
				 //           3A
				 System.out.println("("+i+","+j+")");	
			 }		
		}
		//     1    2       3                        4
		//    i=0  0<2   1A   2A   3A    4A         i=1
	    //               j=0  0<2 (0,0) j=1
        //               j=1  1<2 (0,1) j=2
                //       j=2  2<2 **********
        //	  i=1  1<2   1A   2A   3A    4A         i=2
		    //           j=0  0<2 (1,0) j=1
	        //           j=1  1<2 (1,1) j=2
	                //   j=2  2<2 *************
		//    i=2  2<2 **********************************
		
		 
		 //Jumping Statement
		 //1. Break - Example in Switch Conditional Statement
		 
		 //2. Continue
		 for (int i = 1; i <= 10; i++) {
			 if (i%2!=0) {
				 continue; //Skips one iteration
			}
			 System.out.println(i);		
		}
		 
		 // Types of String
		 //Literal String & Immutable
		 String s1 = "java";
		 System.out.println(s1);
		 System.out.println(System.identityHashCode(s1));
		 String s2 = "java";
		 System.out.println(s2);
		 System.out.println(System.identityHashCode(s2));
		 System.out.println(s1.concat(s2));
		 System.out.println(System.identityHashCode(s1.concat(s2)));
		 
		 // Non-Literal String
		 String s3 = new String ("java");
		 System.out.println(s3);
		 System.out.println(System.identityHashCode(s3));
		 String s4 = new String ("java");
		 System.out.println(s4);
		 System.out.println(System.identityHashCode(s4));
		 
		 // Mutable String
		 StringBuffer s5 = new StringBuffer ("java");
		 System.out.println(s5);
		 System.out.println(System.identityHashCode(s5));
		 StringBuffer s6 = new StringBuffer ("java");
		 System.out.println(s6);
		 System.out.println(System.identityHashCode(s6));
		 System.out.println(s5.append(s6));
		 System.out.println(System.identityHashCode(s5.append(s6)));
		 
		 // Empty
		 String s7 ="";
		 System.out.println(s7);
		 
		 //Null
		 String s8 = null;
		 System.out.println(s8);
		 
		 
	}
	

}
