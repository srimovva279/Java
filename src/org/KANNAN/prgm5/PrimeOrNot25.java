package org.KANNAN.prgm5;

public class PrimeOrNot25 {

	private static void primeornot(int num) {
		
		
		boolean result=true;
		
		if(num==0||num==1) {
			
			System.out.println("0 and 1 are not consider as prime");
		}
		
		else 
		{
			for (int i = 2; i <=num/2; i++) {
				
				if(num%i==0) {
					result=false;
//					break;
				}
			}
			if(result==true) {
				
				System.out.println("Prime Number");
			}
			else 
			{
				System.out.println("Not prime Number");
			}
		}

	}
	public static void main(String[] args) {
		primeornot(17);
	}
}
