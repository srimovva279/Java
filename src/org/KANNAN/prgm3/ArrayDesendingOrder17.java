package org.KANNAN.prgm3;

public class ArrayDesendingOrder17 {
public static void main(String[] args) {
		
		int a[]= {55,20,60,90,15,35},temp;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
	}
}
