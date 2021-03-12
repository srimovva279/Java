package org.KANNAN.prgm4;

public class VowelsandConsonants21 {

	
	public static void main(String[] args) {
		
		
		String s="All the best";
		String vowels="";
		String Consonants="";
		
		
	for (int i = 0; i < s.length(); i++) {
		
			char a = s.charAt(i);
		
			if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U') {
			
			
			vowels = vowels+a;
			
			
		}
		else {
			
			Consonants= Consonants+a;		
		}
		
		
	}
	System.out.println("Vowles are: "+vowels);
	System.out.println("Consonants are :"+Consonants);
		
	}
	
	
	
	
	
	
}
