package org.TasksKannan;

import java.util.ArrayList;
import java.util.List;

public class ListEX {
	public static void main(String[] args) {
		
	
	
	List <Object> l=new ArrayList<>();
	
	l.add(20);
	l.add('M');
	l.add("java");
	l.add(942292524l);
	l.add("sql");
	l.add(4.55f);
	
//	System.out.println(l);
	
	Object object = l.get(2);
	System.out.println(object);
	

	
	}

}
