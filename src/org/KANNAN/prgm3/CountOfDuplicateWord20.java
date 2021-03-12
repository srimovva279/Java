package org.KANNAN.prgm3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountOfDuplicateWord20 {
public static void main(String[] args) {
	
	String s="java sql java phython";
	
	String[] split = s.split(" ");
	
	
	List<String> l=new ArrayList<>();
	for (String words : split) {
		
		l.add(words);
	}
//	System.out.println(l);
	
	Set<String> set=new HashSet<>();
	
	set.addAll(l);
	
	System.out.println(l.size()-set.size()+" Duplicate Count");
		
}
}
