package com.framework;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class LinkedListQueueClass {

	public static void main(String[] args) {
		 Queue<String> linkedList = new LinkedList<>();
		System.out.println("Linked List Size is: "+linkedList.size());
		linkedList.add("Shakib");
		linkedList.add("Tamim");
		linkedList.add("Riyad");
		linkedList.add("Mushfiq");
		linkedList.add("Mashrafe");
		System.out.println("Size: "+linkedList.size());
		
		try {
			linkedList.remove();
		} catch (NoSuchElementException e) {
			System.out.println("Empty Linked Liat");
		}
		
		System.out.println("Now Size is:"+linkedList.size());
	}

}
