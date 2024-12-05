package org.abs;

public class AbstractC extends AbstractB  {
	public void customer () {
		 System.out.println("2.Abstract Method Body - Customer");  
	 }
	public void admin () {
		 System.out.println("2.Abstract Method Body - Admin");  
	 }
	public static void main(String[] args) {
		AbstractC obj = new AbstractC ();
		obj.customer();
		obj.admin();
		obj.empolyee();
		AbstractB obj1 = new AbstractB ();
		obj1.customer();
		obj1.admin();
		obj1.empolyee();
		
	}
}

//Class           A           B                 C
//Properties      A          A&B              C&B&A
//Method        Emp,Cus,Ad  Emp,1.Cus,1.Ad  Emp,2.Cus,2.Ad