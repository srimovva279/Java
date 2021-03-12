package org.Constructor;

public class SampleThis {

	public SampleThis() 
	{
		this(25);
		System.out.println("Details");
	}
public SampleThis(int age) {
		this(9422292524l, "srikanth");
		System.out.println("Age is:"+age);
	}
public SampleThis(long Phno, String name) {
	this("abc@gmail.com",22.2 );
	System.out.println("Phno is:"+Phno);
	System.out.println("Name is:"+name);
}
public SampleThis(String email, double weight) {
	
	System.out.println("Email is:"+email);
	System.out.println("weight is:"+weight);
}
public static void main(String[] args) {
	SampleThis s=new SampleThis();
}
}
