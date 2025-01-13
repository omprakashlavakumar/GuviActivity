package org.test;
import org.testng.annotations.Test;


public class SampleOne {
	 @Test(groups="Alpha")
		public void Test1 () {
		 System.out.println("TC 01");
		}
	 @Test(groups="Beta")
		public void Test2 () {
		 System.out.println("TC 02");
		}
	 @Test(groups="Alpha")
		public void Test3 () {
		 System.out.println("TC 03");
		}
	 @Test(groups={"Alpha","Zeta"})
		public void Test4 () {
		 System.out.println("TC 04");
		}
	 @Test(groups="Zeta")
		public void Test5 () {
		 System.out.println("TC 05");
		}
	 @Test(groups="Zeta")
		public void Test6 () {
		 System.out.println("TC 06");
		}
	 @Test(groups="Beta")
		public void Test7 () {
		 System.out.println("TC 07");
		}
		
}
