package org.list;

import java.util.List;
import java.util.Vector;

public class Sample1 {
public static void main(String[] args) {
	
	List <Integer> l=new Vector<>();
	
	l.add(10);
	l.add(200);
	l.add(50);
	l.add(10);
	
	
//	System.out.println(l);
	
	Integer integer = l.get(2);
	System.out.println(integer);
	
	
	Integer set = l.set(1, 100);
	System.out.println(l);
	
//	l.add(1, 20);
//	System.out.println(l);
	
	int indexOf = l.indexOf(50);
	System.out.println(indexOf);
	  
	Integer r = l.get(2);
	System.out.println(r);
	
	int lastIndexOf = l.lastIndexOf(10);
	System.out.println(lastIndexOf);
	
	l.remove(1);
	System.out.println(l);
	
	for (Integer ragava : l) {
		
		System.out.println(ragava);
	}
}
}
