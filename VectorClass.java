package com.framework;

import java.util.List;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		List <String> vector = new Vector<>();
		System.out.println("Initialize Vector Size: "+vector.size());
		vector.add("Mango");
		vector.add("Banana");
		vector.add("Guava");
		vector.add("Grape");
		vector.add("Orange");
		System.out.println("After add value then Vector Size: "+vector.size());
		vector.remove(2);
		vector.remove(3);
		System.out.println("After add value then Vector Size: "+vector.size());
		boolean results = vector.contains("Guava");
		 System.out.println(results);
	}

}
