package org.KANNAN.prgm1;

public class ArmstrongNum3 {
public static void checkArmstrong(int num) {
	
	int n=num;
	int reminder=0;
	int result=0;
	
	while (num>0)
	{
		reminder=num%10;
		result=result+(reminder*reminder*reminder);
		num=num/10;
	}
	if(n==result)
	{
		System.out.println("Armstrong number");
	}
	else
	{
		System.out.println("not Armstrong number");
	}
	
}
public static void main(String[] args) {
	checkArmstrong(153);
}
}
