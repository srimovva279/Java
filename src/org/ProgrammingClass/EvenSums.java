package org.ProgrammingClass;

public class EvenSums {

	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i = 0; i <=10; i=i+2) {
			
			System.out.println(i+"Even Number");
			
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
