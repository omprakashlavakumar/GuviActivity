package org.test;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertion {
	public static void main(String[] args) {
		        System.out.println("One");
		        // Hard Assertion
				boolean a = true;
				Assert.assertTrue(a, "Condition True");
				
				int b = 10;
				Assert.assertEquals(b,10);
				//Assert.fail();
				
				// Soft Assertion
				SoftAssert sa = new SoftAssert();
				sa.assertEquals(10,20);
				System.out.println("Two");
				System.out.println("3");
				System.out.println("4");
				sa.assertAll();
				System.out.println("5");
				System.out.println("6");
				System.out.println("7");			
				
	}

}
