package org.KANNAN.prgm2;

public class ReverseString9 {
public static void main(String[] args) {
	
	String s="Welcome to java class";
	
	String reverse="";
	
	
	
	for (int i = s.length()-1; i >=0; i--) {
		
		char charAt = s.charAt(i);
		
		reverse=reverse+charAt;
		
	}
	System.out.println(reverse);
}
}
