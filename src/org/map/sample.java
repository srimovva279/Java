
package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class sample {

	public static void main(String[] args) {
		
		Map<Integer, String> m=new TreeMap<>();
		
		
		m.put(10, "java");
		m.put(20, "arsql");
		m.put(30, "lol");
		
//		int size = m.size();
//		System.out.println(size);
////		String string = m.get(30);
////		System.out.println(string);
//		
//		boolean containsKey = m.containsKey(20);
//		System.out.println(containsKey);
//		
//		Set<Integer> keySet = m.keySet();
//		System.out.println(keySet);
//		
//		Collection<String> values = m.values();
//		System.out.println(values);
//		
		Set<Entry<Integer, String>> en = m.entrySet();
		
		for (Entry<Integer, String> x : en) {
			
			System.out.println(x);
//			System.out.println(x.getValue());
////		}
//		
//		String string2 = m.get(40);
//		System.out.println(string2);
	}
	}}
