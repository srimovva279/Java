package org.ProgrammingClass;

public class Pallindrom {
public static void main(String[] args) {
	
	int num=121;
	int n=num;
	int result=0;
	int reminder=0;
	
	while(num>0)
	{
		reminder=num%10;
		result=(result*10)+reminder;
		num=num/10;
	}
	if(n==result)
	{
		System.out.println("pallindrome");
	}
	else
	{
		System.out.println("Not pallindrom");
	}
}
}
