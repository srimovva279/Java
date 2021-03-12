package org.Varibles;


public class Sample {
	int a=10;
	 static int b=20;
	 
	 public  void mai() {
		System.out.println(a);
		System.out.println(b);
		a++;
		b++;
	}

public static void main(String[] args) {
	
	Sample g = new Sample();
	
	g.mai();
	
	Sample w = new Sample();		
    w.mai();
	
Sample t = new Sample();
	
	t.mai();
	
}

}
