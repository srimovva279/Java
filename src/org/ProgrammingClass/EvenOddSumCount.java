package org.ProgrammingClass;

public class EvenOddSumCount {

	private void evenCount() {
		
	int sum=0;
	int count=0;
	int Ocount=0;
	int Osum=0;
	
	for (int i = 0; i <=10; i++) {
		
		if(i%2==0)
		{
			System.out.println(i+"Even Number");
			sum=sum+i;
			count++;
		}
		else
		{
			System.out.println(i+"Odd Number");
			Osum=Osum+i;
			Ocount++;
		}
	}
	System.out.println(sum+"Sum of Even Numbers");
	System.out.println(count+"Count of even Numbers");
	
	System.out.println(Osum+"sum of Odd numbers");
	System.out.println(Ocount+"Count of Odd Numbers");
	}
	public static void main(String[] args) 
	{
	EvenOddSumCount e=new EvenOddSumCount();
					e.evenCount();
}
}
