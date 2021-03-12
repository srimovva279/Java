
package org.Scanner;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		
		System.out.println("Enter name");
		String nextLine = s.nextLine();
		System.out.println("name is:" + nextLine);

		System.out.println("Name of city");
		String next = s.next();
		System.out.println("name:" + next);

		
		
		
		
		
		System.out.println("enter age");
		byte b = s.nextByte();
		System.out.println("age is:" + b);

//		System.out.println("enter Id");
//		short s1 = s.nextShort();
//		System.out.println("ID is:" + s1);

		
	}
}
