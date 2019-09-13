package com.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
	 List <String> input = new ArrayList<>();
	 System.out.println("Initialize Size of Array List:" +input.size());
	 input.add("Apple");
	 input.add("Banana");
	 input.add("Orange");
	 input.add("Guava");
	 input.add("Grape");
	 input.add("Mango");
	 System.out.println("Initialize Size of Array List:" +input.size());
	// System.out.println("After size of ArrayList");
	 
	input.remove(2);
	input.remove(0);
	 System.out.println("Initialize Size of Array List:" +input.size());
	 
	 boolean results = input.contains("Guava");
	 System.out.println(results);
	}

}
