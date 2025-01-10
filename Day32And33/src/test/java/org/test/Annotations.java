package org.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Annotations {
	// -2,-1,0,1,2,3
	@Test 
	public void Test1 () {
		System.out.println("Test 01");
		// Hard Assert
		boolean a = true;
		Assert.assertTrue(a, "Condition True");
		int b = 10;
		Assert.assertEquals(b,10);
		//Assert.fail();
	}
	@Test (priority = -2)
	public void Test2 () {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(10,10);
		System.out.println("Test 02");
		sa.assertAll();	
	}
	@Test (enabled = false)
	public void Test () {	
		System.out.println("Test 05");		
	}
	@Test (priority = 1, invocationCount = 3)
	public void ATest () {	
		System.out.println("Test 04");		
	}
	@Test (priority = 1)
	public void Test3 () {	
		System.out.println("Test 03");		
	}
	
	@AfterTest
	public void afterTest () {
		System.out.println("After Test");
	}
	@AfterSuite
	public void afterSuite () {
		System.out.println("After Suite");
	}
	@AfterMethod
	public void afterMethod () {
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClass () {
		System.out.println("After Class");
	}
	@AfterGroups
	public void afterGroup () {
		System.out.println("After Group");
	}
	
	@BeforeTest
	public void beforeTest () {
		System.out.println("Before Test");
	}
	@BeforeSuite
	public void beforeSuite () {
		System.out.println("Before Suite");
	}
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("Before Method");
	}
	@BeforeClass
	public void beforeClass () {
		System.out.println("Before Class");
	}
	@BeforeGroups
	public void beforeGroup () {
		System.out.println("Before Group");
	}
	

}
