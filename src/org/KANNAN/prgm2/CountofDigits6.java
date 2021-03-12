package org.KANNAN.prgm2;

public class CountofDigits6 {
public static void main(String[] args) {
	

	int num=15345;
	int count=0;
	
	while(num>0)
	{
		count=count+1;
		num=num/10;
	}
	
	System.out.println(count);
}
}