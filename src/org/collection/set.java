package org.collection;

import java.util.Set;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {
		
		Set<Integer> s=new TreeSet<>();
		
		s.add(100);
		s.add(90);
		s.add(70);
		s.add(60);
		s.add(20);
		s.add(10);
	
		System.out.println(s);
		
	//To find the length
		int a=s.size();
		System.out.println(a);
		
	//To remove the value
		s.remove(60);	 
		System.out.println(s);
		
		s.removeAll(s);
		System.out.println(90);
	}
}
