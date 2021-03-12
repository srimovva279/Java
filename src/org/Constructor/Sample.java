package org.Constructor;

public class Sample {

	public Sample() {
		System.out.println("Non-Paramaterised Constructor");
	}
	
	public Sample(int a) {
		System.out.println("Paramaterised Constructor");
	}
	
	public static void main(String[] args) {
		
//		Sample s1=new Sample();
		Sample s=new Sample(12);
		
	}
	
}
