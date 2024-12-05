package org.abs;

public class AbstractB extends AbstractA   {
	public void customer () {
		 System.out.println("1.Abstract Method Body - Customer");  
	 }
	public void admin () {
		 System.out.println("1.Abstract Method Body - Admin");  
	 }
	}


// Class           A           B                 C
// Properties      A          A&B              C&B&A
// Method        Emp,Cus,Ad  Emp,1.Cus,1.Ad  Emp,2.Cus,2.Ad