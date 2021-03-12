 package org.ProgrammingClass;

public class UpperCase {

	public static void main(String[] args) {
		
		String name="welcome to java class";
		//output="Welcome To Java Class"
		
		String res="";
		String a="";
		
		//(org.String[] str=["Welcome","to","java","class"])--To Understand
		
		String[] splits = name.split(" ");
		
		for (String word : splits) {
			
			char charAt = word.charAt(0);
			
			char upperCase = Character.toUpperCase(charAt);
		
			String substring = word.substring(1);
	
			res = upperCase + substring;
			
			
			a=a+" "+res;
			

		}	
		
		System.out.println(a);
	}
}
