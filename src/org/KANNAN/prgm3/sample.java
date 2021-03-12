package org.KANNAN.prgm3;

public class sample {

	public static void main(String[] args) {

		String s = "madam ";
		String b=s;

		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			char charAt = s.charAt(i);
			reverse = reverse + charAt;
		}
		System.out.println(reverse);

	if(b==reverse)
	{
		System.out.println("palindrom");
	}
	else {
		System.out.println("not palindrom");
	}
}
}