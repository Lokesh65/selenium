package org.pojoclass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lokesh {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(70);
		s.add(80);
		s.add(90);
		for (Integer mark : s) {
			System.out.println(mark);
		}
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		m.put("Tamil", 70);
		m.put("English", 80);
		m.put("Maths", 90);
		
		System.out.println(m);	
		
				
	}
}

