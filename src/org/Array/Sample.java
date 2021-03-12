 package org.Array;

public class Sample {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		a[4]=50;
		a[2]=30;
		a[1]=20;
		a[3]=50;
		a[0]=40;
		
	//To find the length	
		int i = a.length;
		System.out.println(i);
		
	//To get particular value
		
		System.out.println(a[3]);
		
	//To print all elements by Index order
		for (int j = 0; j < a.length; j++) {
			
			System.out.println(a[j]);
		}
		
		
	//To print all values 
		for (int x : a) {
			
			System.out.println(x);
		}
		
	}
}
