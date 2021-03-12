package org.ProgrammingClass;

public class ProductOfDigits {
	public static void main(String[] args) {
		
	

	int num=123;
	int product=1;
	int reminder=0;
	
	while(num>0)
	{
		reminder=num%10;
		product=product*reminder;
		num=num/10;
	}
	
	System.out.println(product);
	}
}
