package org.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	/*
	 * Set doesn't allow duplicates
	 * Value Based one
	 * Normal For loop Can't be used
	 * 
	 * Hashset - Random Order
	 * LinkedHashset - Insertion Order
	 * TreeSet - Ascending Order
	 */
	
	public static void main(String[] args) {
		Set <Integer> set1 = new HashSet <Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(40);
		
		System.out.println(set1);
		//To get size of the set
		System.out.println(set1.size());
		
		Set <Integer> set2 = new LinkedHashSet <Integer>();
		set2.add(100);
		set2.add(200);
		set2.add(300);
		set2.add(400);
		System.out.println(set2);
		
		Set <Integer> set3 = new TreeSet <Integer>();
		set3.add(444);
		set3.add(265);
		set3.add(897);
		set3.add(197);
		System.out.println(set3);
		
		//Enhanced For Loop
		for (Integer integer : set3) {
			System.out.println(integer);
		}
		
		//Remove a value from the set
		set3.remove(444);
		System.out.println(set3);
		
		//Check the Value present or not
		System.out.println(set3.contains(197));
		
		//Check whether the set is empty or not
		System.out.println(set3.isEmpty());
		
		List<Integer> listTwo = new ArrayList<Integer>();
		listTwo.add(11);
		listTwo.add(22);
		listTwo.add(33);
		listTwo.add(44);
		listTwo.add(55);
		System.out.println(listTwo);
		
		// Can add list and Set
		listTwo.addAll(set2);
		System.out.println(listTwo);
		
		// It will retain Only the Common Values
		set2.retainAll(listTwo);
		System.out.println(set2);
		
		// Can add list and Set
		set1.addAll(set2);
		System.out.println(set1);
		
		// Remove the set from one set
		set2.removeAll(set1);
		System.out.println(set2);
		
		
	}

}
