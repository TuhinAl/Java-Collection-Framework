package com.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class IteratorClass {

	public static void main(String[] args) {
		List<String> clubList = new ArrayList<>();
		 System.out.println("Array List size is: "+clubList.size());
		 clubList.add("Real Madrid");
		 clubList.add("Liverpool");
		 clubList.add("Mancherter United");
		 clubList.add("Arsenal");
		 clubList.add("Chelsea");
		 System.out.println("Array List size is: "+clubList.size());
		  Iterator<String> iterator = clubList.iterator();
		  
		 
		  
		  while (iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
			
			try {
				if((iterator.next())=="Arsenal") {
					iterator.remove();
				}
				
			} catch (NoSuchElementException e) {
				System.out.println("This Element Doesn't Exist");
			}
			
		}
		 
		 
	}

}
