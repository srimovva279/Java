package org.KANNAN.prgm3;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountOfDuplicateCharacter18 {
public static void main(String[] args) {
	

	String s="raining here...";

	
	String[] split = s.split("");
	
	List<String> l=new ArrayList<>();
	
	for (String letters : split) {
		
		l.add(letters);
	}
	
	Set<String>set=new HashSet<>();
	
	set.addAll(l);
	
	System.out.println(l.size()-set.size()+" Duplicate Count");
}
}
