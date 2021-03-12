package org.KANNAN.prgm2;

public class StringPalindromeorNot10 {
public static void main(String[] args) {
	
	String s="welcome to java class";
	String reverse="";
	
	for (int i = s.length()-1; i>0; i--) {
		
		char charAt = s.charAt(i);
		reverse=reverse+charAt;
	}
	if(reverse==s) {
		System.out.println("palindrome2");
	}
	else {
		System.out.println("Not palindrome2");
	}
}
}
