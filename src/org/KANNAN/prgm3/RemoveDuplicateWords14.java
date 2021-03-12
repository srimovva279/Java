package org.KANNAN.prgm3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords14 {

public static void RemoveDuplicates(String s) {
		
		String result ="";
		String[] split = s.split(" ");
		
		Set<String> set = new LinkedHashSet<>();
		
		for (String a : split) {
			
			set.add(a);		
			}
			
		for (String string : set) {
			
			result = result+" "+string;
		}
		
		System.out.println(result);
			
	}
			

	public static void main(String[] args) {
		
		RemoveDuplicates("java sql java phython java phython");
		
			}
}
