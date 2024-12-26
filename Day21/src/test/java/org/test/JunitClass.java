package org.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitClass {
	

	@BeforeClass  // Launch the Browser
	public static void BeforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass   // Quit the Browser
	public static void AfterClass() {
		System.out.println("After Class");
	}
	@Test
	public void test2() {
		System.out.println("Hello2");
	}
	@Ignore
	@Test
	public void test3() {
		System.out.println("Hello3");
	}
	@Test
	public void test1() {
		System.out.println("Hello1");
	}
	@Before    // Take Screenshot
	public void Before() {
		System.out.println("Before each @test");
	} 
	@After     // Take Screenshot
	public void After() {
		System.out.println("After each @test");
	}
	

}
