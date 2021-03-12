  package org.String;

public class Sample2 {

	public static void main(String[] args) {
		
		
		String s="Java";
		String s1="selenium";
		
	//To check Whether String is Equals or Not
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
	//Equals After ignoring Cases 
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		
	//To Join Strings 
		String concat = s.concat(s1);
		System.out.println(concat);
//------------------------------------------------------//
		
		String s2=" java Ap plica tion";
		
	//To remove Unwanted Space(Before index space it will remove)
		
		String trim = s2.trim();
		System.out.println(trim);
		
//------------------------------------------------------//
		
		String s3="hi welcome to java class";
		String s4="";
		
	//To get another String(it will remove character till give index )
		String substring = s3.substring(5);
		System.out.println(substring);
		
	// (it will pring between beging index and ending index)
		String substring2 = s3.substring(4, 15);
		System.out.println(substring2);
		
	//
		String[] split = s3.split(s4);
		System.out.println(split);
		
		
		
		
		
		
	}
}
