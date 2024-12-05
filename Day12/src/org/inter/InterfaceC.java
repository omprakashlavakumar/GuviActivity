package org.inter;

public class InterfaceC extends Hybrid implements InterfaceA, InterfaceB {
	public void customer () {
		System.out.println("Customer Method");
	}
    public void admin () {
    	System.out.println("Admin Method");
	}
    public void manager () {
		System.out.println("Manager Method");
	}
    public void client () {
    	System.out.println("Client Method");
	}
    
    public static void main(String[] args) {
    	InterfaceC obj = new InterfaceC ();
    	obj.customer();
    	obj.admin();
    	obj.manager();
    	obj.client();
    	obj.hybrid();
	}
}

// Class A --->  Class C  <----- Class B
