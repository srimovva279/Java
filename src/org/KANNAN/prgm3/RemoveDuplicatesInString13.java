package org.KANNAN.prgm3;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.TasksKannan.listRetainAll;
import org.collection.set;

public class RemoveDuplicatesInString13 {
	
	public static void RemoveDuplicates(String s) {
		
		String result ="";
		String[] split = s.split("");
		
		Set<String> set = new LinkedHashSet<>();
		
		for (String a : split) {
			
			set.add(a);		
			}
			
		for (String string : set) {
			
			result = result+string;
		}
		
		System.out.println(result);
			
	}
			

	public static void main(String[] args) {
		
		RemoveDuplicates("raining here...");
		
			}
	}