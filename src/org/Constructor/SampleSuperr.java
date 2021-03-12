package org.Constructor;

public class SampleSuperr extends SamplesSuper{

	public SampleSuperr() {
		super(22);
		System.out.println("Child Non-parameterised constructor");
	}
	public SampleSuperr(long Phn) {
		super(9422292524l,"srikanth");
		System.out.println("hellow no is:+Phn");
	}
	public SampleSuperr(double weight) {
	    super(25);
		System.out.println("Weight is:" +weight);
	}
	 
	public static void main(String[] args) {
		
		SampleSuperr s=new SampleSuperr(9548022228l);
		SampleSuperr s1=new SampleSuperr(22.5);
		
	}
}
