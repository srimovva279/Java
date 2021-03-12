package org.String;

public class Sample1 {
	public static void main(String[] args) {
		

	String s="Java application";

	//To Find the Length
	
	int a=s.length();
	System.out.println(a);
	
	// To get the Particular Character
	
	char c = s.charAt(2);
	System.out.println(c);
	
	//To Find the index position
	
	int indexOf = s.indexOf("l");
	System.out.println(indexOf);
	
	//To check whether String is empty or not
	
	boolean empty = s.isEmpty();
	System.out.println(empty);
	
	//To Find the last IndexPosition
	
	int lastIndexOf = s.lastIndexOf("o");
	System.out.println(lastIndexOf);
	
	//To convert to Capital Letters
	
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	
	//To convert Small letters
	
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	
	//To check Whether String starts with
	
	 boolean startsWith = s.startsWith("ja");
	 System.out.println(startsWith);
	 
	//To check whether String ends 
	 
	 boolean endsWith = s.endsWith("on");
	 System.out.println(endsWith);
	
	//To Check whether the string has particular word or not
	 
	 boolean contains = s.contains("va");
	 System.out.println(contains);
	 
	//To replace the particular Character
	 
	 String replace = s.replace("J", "i");
	 System.out.println(replace);
	
	 //To replace the whole String 
	 String replaceAll = s.replaceAll("Java", "selenium");
	 System.out.println(replaceAll);
	 
	
}
}