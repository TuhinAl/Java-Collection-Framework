package com.framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
		Map<String,Integer> hashMap = new HashMap<>();
		System.out.println("Initialize Size:" +hashMap.size());
		hashMap.put("Apple", 5);
		hashMap.put("Banana", 10);
		hashMap.put("orange", 15);
		hashMap.put("Mango", 20);
		System.out.println("After size is : "+hashMap.size());
		System.out.println("Hash Map Value:" +hashMap.values());
		System.out.println(hashMap.get("Banana"));
	}

}
