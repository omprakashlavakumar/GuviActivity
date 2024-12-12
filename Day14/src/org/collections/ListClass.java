package org.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass {
	public static void main(String[] args) {
		/* List Allow Duplicates. 
		 * List is Index Based One
		 * List maintains insertion order 
		 * ArrayList insertion and deletion is difficult, Searching is easy
		 * LinkedList insertion and deletion is easy, Searching is difficult */
		List<String> listOne = new ArrayList<String>();
		
		// Add the value in the list
		listOne.add("Car");
		listOne.add("Lorry");
		listOne.add("JCB");
		listOne.add("Car");
		listOne.add("Van");
		
		// To Print whole list
		System.out.println(listOne);
		// To get the value based on Index
		System.out.println(listOne.get(2));
		// To get the size 
		System.out.println(listOne.size());
		// To find the index of the Value
		System.out.println(listOne.indexOf("Car"));
		// To find the last index of value
		System.out.println(listOne.lastIndexOf("Car"));
		// To replace at particular index
		listOne.set(3,"Bus");
		System.out.println(listOne);
		// To insert at particular index
		listOne.add(2,"Bike");
		System.out.println(listOne);
		// Check whether the value is present
		System.out.println(listOne.contains("Bus"));
		// To remove a particular Value based on Index
		listOne.remove(0);
		System.out.println(listOne);
		// To remove a particular value
		listOne.remove("JCB");
		System.out.println(listOne);
		// Can add null Value
		listOne.add(null);
		System.out.println(listOne);
		
		
		List listTwo = new ArrayList();
		listTwo.add(10);
		listTwo.add(20);
		listTwo.add(30);
		listTwo.add(40);
		listTwo.add(50);
		System.out.println(listTwo);
		
		// Adding ListOne into List Two
		listTwo.addAll(listOne);
		System.out.println(listTwo);
		System.out.println(listOne);
		
		// Print All the Values 
		
		// Normal For Loop
		for (int i = 0; i < listTwo.size(); i++) {
			System.out.println(listTwo.get(i));	
		}
		
		// Enhanced For Loop
		for (Object object : listTwo) {
			System.out.println(object);
		}
		
		// It will retain Only the Common Values
		listOne.retainAll(listTwo);
		System.out.println(listOne);
		
		// Remove Whole List
		listTwo.removeAll(listOne);
		System.out.println(listTwo);
		
		// To Clear the List
		listOne.clear();
		System.out.println(listOne);
		
		
		//LinkedList
		LinkedList <String> listThree = new LinkedList<String>();
		listThree.add("One");
		listThree.add("Two");
		listThree.add("Three");
		listThree.add("Four");
		System.out.println(listThree);
		
		// Adding as 1st Value
		listThree.addFirst("Zero");
		System.out.println(listThree);
		
		// Adding as last Value
		listThree.addLast("Five");
		System.out.println(listThree);
		
		// Remove 1st Value
		listThree.poll();
		System.out.println(listThree);
		
		// Remove last Value
		listThree.pollLast();
		System.out.println(listThree);
		
		// Remove 1st Value
		listThree.remove();
		System.out.println(listThree);
		
		// Remove last Value
		listThree.removeLast();
		System.out.println(listThree);

		
// List is Non-Synchronized
// Synchronized - If you add a value while reading the list it will add the Value
		
		
	}

}
