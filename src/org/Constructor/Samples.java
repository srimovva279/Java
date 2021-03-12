package org.Constructor;

public class Samples {

	public Samples() {
		System.out.println("Non-parametrised Constructor");
		
	}	
	
	public Samples(int age) {
		System.out.println("Age is:" +age);
		
	}
	public Samples(long Phno) {
		System.out.println("Phone Number:" +Phno);
		
	}
	public Samples(String Name) {
		System.out.println("Name is:" +Name);
		
	}
	public static void main(String[] args) {
		
		Samples s=new Samples("srikanth");
		Samples s1=new Samples(9422292524l);
		Samples s2=new Samples();
		Samples s3=new Samples(12);
	}
}
