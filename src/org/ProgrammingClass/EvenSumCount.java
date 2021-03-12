package org.ProgrammingClass;

public class EvenSumCount {

	public static void main(String[] args) {
		
		int sum=0;
		int count=0;
		
		for (int i = 0; i <=10; i++) {
			
			sum=sum+i;
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
	}
}
