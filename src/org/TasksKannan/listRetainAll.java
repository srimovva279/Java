package org.TasksKannan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listRetainAll {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		
		List<Integer> l1=new LinkedList<>();
		l1.add(60);
		l1.add(70);
		l1.add(10);
		l1.add(40);
		l1.add(80);
		l1.add(90);
		
		
		l.retainAll(l1);
		System.out.println(l);
		
		
	}
}
