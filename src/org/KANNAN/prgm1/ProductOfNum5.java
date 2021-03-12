package org.KANNAN.prgm1;

public class ProductOfNum5 {

	private static void product(int num) {
		
		int reminder=0;
		int product=1;
		
		
		while(num>0)
		{
			reminder=num%10;
			product=product*reminder;
			num=num/10;
		}
		System.out.println(product);

	}
	public static void main(String[] args) {
		product(153);
	}
}
