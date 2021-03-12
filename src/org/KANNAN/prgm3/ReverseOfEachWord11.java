package org.KANNAN.prgm3;

public class ReverseOfEachWord11 {

	public static void main(String[] args) {
		
		String s="Welcome to java Class";
		
		String result ="";
				
		
		String[] split = s.split(" ");
		
		
		for (String words : split) {
			
			String reverse ="";
			
		for (int i = words.length()-1; i>=0; i--) {
			
			char charAt = words.charAt(i);
			reverse = reverse+charAt;	
			
		}
		result = result+" "+reverse;
		}
		
		System.out.println(result);
		
	}
}
