package org.KANNAN.prgm1;

import java.awt.geom.Ellipse2D;

public class sample {

	public static void main(String[] args) {
		
	int a=153;
	int b=a;
	
	int result=0;
	int reminder=0;
	
	while(a>0)
	{
		reminder=a%10;
		result=result+(reminder*reminder*reminder);
		a=a/10;
		
	}
	
	System.out.println(result);
	
	
	if(b==result) {
		System.out.println("Armstrong");
	}
	else {
		System.out.println("Not armstrong");
	}
}
}