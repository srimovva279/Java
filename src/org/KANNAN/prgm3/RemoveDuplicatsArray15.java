package org.KANNAN.prgm3;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatsArray15 {

	public static void main(String[] args) {
		
		int a[]= {55,39,26,78,55,99,30};
		
		Set<Integer> s=new TreeSet<>();
		
      for (int i = 0; i < a.length; i++) {
    	  s.add(a[i]);
		
	}	
      
      for (Integer x : s) {
    	  System.out.println(x);
		
	}
	}
}
