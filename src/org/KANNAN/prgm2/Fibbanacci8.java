package org.KANNAN.prgm2;

public class Fibbanacci8 {
public static void main(String[] args) {
	
	
	int a=0;
	int b=1;
	int num=5;
	
System.out.println(a);
	System.out.println(b);
	
	for (int i = 1; i <=num; i++) {
		
		int c=a+b;
		
		System.out.println(c);
		a=b;
		b=c;
	}
}
}
