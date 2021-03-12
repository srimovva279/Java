package org.KANNAN.prgm1;

public class ReverseNUM1 {
public static void main(String[] args) {
	

	int num=12345;
	String j=String.valueOf(num);
	String reverse="";
	
	for (int i = j.length()-1; i >=0; i--) {
		
		char charAt = j.charAt(i);
		reverse=reverse+charAt;
	}
	System.out.println(reverse);
}
	
}	

