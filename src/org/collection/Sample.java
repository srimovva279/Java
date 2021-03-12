package org.collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		
	     List<Object> l=new ArrayList<>();
		
		l.add(10);
		l.add("java");
		l.add('M');
		l.add(9422292524l);
		l.add(4500.45f);
		l.add(10);
		
		
//		System.out.pri ntln(l);
		
		Object object = l.get(2);
		System.out.println(object);
		
		
		Object set = l.set(1, "lol");
		System.out.println(l);
		
	}
}
