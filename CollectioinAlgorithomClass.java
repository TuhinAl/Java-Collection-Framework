package com.framework;


import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;


public class CollectioinAlgorithomClass {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		
		System.out.println(list.size());
		
		Iterator<Integer> ite = list.iterator();
		
		
		while(ite.hasNext()) {
			System.out.print(ite.next()+" ");
		}
		
		//Comparator<Object> comp =  Collections.reverseOrder();
		
		
	
	}

}
