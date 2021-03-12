package org.ProgrammingClass;

public class ReverseWords {

	public static void main(String[] args) {
		
		String s = "Java";
		
		String reverse ="";
		
		for (int i = s.length()-1; i >=0; i--) {
			
			char c = s.charAt(i);
			
			reverse=reverse+c;
			
		}
		System.out.println(reverse);	
	}
}
