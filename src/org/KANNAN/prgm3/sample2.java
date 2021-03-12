 package org.KANNAN.prgm3;

public class sample2 {

	public static void main(String[] args) {
		
		String s="welcome to java class";
		
		String result="";
		String nword="";
		
		String[] split = s.split(" ");
		
		for (String words : split) {
			
			char charAt = words.charAt(0);
			
			nword=Character.toUpperCase(charAt)+words.substring(1);
			result=result+" "+nword;
		}
		
		
		System.out.println(result);
	}
	
}
