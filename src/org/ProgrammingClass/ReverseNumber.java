
package org.ProgrammingClass;

public class ReverseNumber {
public static void main(String[] args) {
	
	int num=123;
	String reverse="";
	
	String j = String.valueOf(num);
//	org.String j = Integer.toString(i);
	
	for (int i = j.length()-1; i >=0; i--) {
		
		char charAt = j.charAt(i);
		
		reverse=reverse+charAt;
		
	}
	System.out.println(reverse);
}
}
