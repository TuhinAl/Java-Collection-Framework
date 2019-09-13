package com.framework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		Map<String,String> treeMap = new TreeMap<>(); 
		System.out.println("TreeMap sizes: "+treeMap.size());
		treeMap.put("Shakib Al Hasan", "5 wickets");
		treeMap.put("Mashrafee bin Mortaza", "3 wickets");
		treeMap.put("Abdur Razzak", "4 wickets");
		treeMap.put("Arafat Sunny", "2 wickets");
		System.out.println("TreeMap sizes: "+treeMap.size());
		System.out.println(treeMap.values());
		System.out.println(treeMap.get("Mashrafee bin Mortaza"));
		
		System.out.println(treeMap.get("Arafat Sunny"));
		System.out.println(treeMap.values());
		System.out.println("TreeMap sizes: "+treeMap.size());

	}

}
