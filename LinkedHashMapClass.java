package com.framework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {

	public static void main(String[] args) {
		Map <String, Integer>linkedMap = new LinkedHashMap<>();
		System.out.println("Initialize Size:" +linkedMap.size());
		linkedMap.put("Shakib Al Hasan", 50);
		linkedMap.put("Tamim Iqbal", 70);
		linkedMap.put("Mahmudullah Riyad",63);
		linkedMap.put("Mushfiqur Rahim", 50);
		System.out.println("After Size:" +linkedMap.size());
		System.out.println("LinkedHashMap values:"+linkedMap.values());
		linkedMap.remove("Shakib Al Hasan");
		linkedMap.remove("Mushfiqur Rahim");
		System.out.println("LinkedHashMap values:"+linkedMap.values());
	}

}
