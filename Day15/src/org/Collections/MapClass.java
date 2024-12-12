package org.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapClass {
	/*
	 * Key and value Combination
	 * Key doesn't allow duplicates and Value allow duplicates
	 * 
	 * HashMap - Random Order
       LinkedHashMap - Insertion Order
       TreeMap - Ascending Order
       HashTable - RandomOrder
*/
	public static void main(String[] args) {
		// HashMap - Random Order
		Map <String , Integer> mi = new HashMap <String , Integer> ();
		mi.put("Tamil", 90);
		mi.put("English", 95);
		mi.put("Maths", 100);
		mi.put("Science", 90);
		mi.put("Social", 90);
		mi.put("Social", 85);
		
		System.out.println(mi);
		
		// LinkedHashMap - Insertion Order
		Map <String , Integer> mi1 = new LinkedHashMap <String , Integer> ();
		mi1.put("Tamil", 90);
		mi1.put("English", 95);
		mi1.put("Maths", 100);
		mi1.put("Science", 90);
		mi1.put("Social", 90);
		mi1.put("Social", 85);
		
		System.out.println(mi1);
		
		//TreeMap - Ascending Order
		Map <String , Integer> mi2 = new TreeMap <String , Integer> ();
		mi2.put("Tamil", 90);
		mi2.put("English", 95);
		mi2.put("Maths", 100);
		mi2.put("Science", 90);
		mi2.put("Social", 90);
		mi2.put("Social", 85);
		
		System.out.println(mi2);
		
		//Size of the collections
		System.out.println(mi.size());
		
		// To get the Value of the key in MAP
		System.out.println(mi.get("Maths"));
		
		// To check whether the key is present
		System.out.println(mi.containsKey("Tamil"));
		
		// To check whether the Value is present
		System.out.println(mi.containsValue(90));
		
		// TO get the Key Set
		/* to get the return type we need to type mi.keySet() 
		and Press Ctrl+2 release Press L */
		Set<String> keySet = mi.keySet();  
		System.out.println(keySet);
		
		// To get the Values
		Collection<Integer> values = mi.values();
		System.out.println(values);
		
		// To print the Entry set
		Set<Entry<String, Integer>> entrySet = mi.entrySet();
		System.out.println(entrySet);
		
		// Enhanced For Loop
		
		//1. Get Key and Value
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		//2. Get Key Alone
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
		}
		//3. Get Value Alone
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getValue());
		}
		
		
		
		
	}

}
