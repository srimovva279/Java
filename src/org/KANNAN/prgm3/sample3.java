package org.KANNAN.prgm3;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class sample3 {

	public static void main(String[] args) {
		
		int a[]= {55,39,26,78,55,99,30};
		
		Set<Integer>set=new TreeSet<>();
		
		for (int i = 0; i < a.length; i++) {
			
			set.add(a[i]);
		}
		
		System.out.println(set);
	}
}
