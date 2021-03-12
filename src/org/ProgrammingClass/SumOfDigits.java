package org.ProgrammingClass;

public class SumOfDigits {

	private static void SumOfDigit(int num) {
		
//		int num=125;
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
			
//			SumOfDigits sum=new SumOfDigits();
			SumOfDigit(120);
	}
}
