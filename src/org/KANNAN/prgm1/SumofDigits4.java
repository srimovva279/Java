package org.KANNAN.prgm1;


public class SumofDigits4 {
	
	private static void sum(int num) {
		
		
		int reminder=0;
		int sum=0;
		
		while(num>0)
		{
			reminder=num%10;
			sum=sum+reminder;
			num=num/10;
		}
		System.out.println(sum);

	}
	public static void main(String[] args) {
		sum(153);
	}
}
