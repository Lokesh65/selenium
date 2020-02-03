package org.pojopack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Manjunath {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(100);
		s.add(150);
		s.add(200);		
		
		for (Integer rate : s) {
			System.out.println(rate);
	
		}
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		m.put("Orange", 100);
		m.put("Apple", 150);
		m.put("Mango", 200);
		System.out.println(m);
	
	}

}
