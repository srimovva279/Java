package org.KANNAN.prgm4;

public class WithoutASCI23 {
	public static void main(String[] args) {

		String s = "KannanDev1235@gmail.com";
		String UCase = "";
		String Lcase = "";
		String Scase = "";
		String Number = "";
		
		int Ucount = 0;
		int Lcount = 0;
		int SPLcount = 0;
		int Numcount = 0;

		for (int i = 0; i < s.length(); i++) {

			char a = s.charAt(i);

			if (a >= 'A' && a <= 'Z') {

				Ucount++;
				UCase = UCase + a;

			}
			if (a >= 'a' && a <= 'z') {

				Lcount++;
				Lcase = Lcase + a;

			}
			if (a >= '0' && a <= '9') {

				Numcount++;
				Number = Number + a;

			} else {

				SPLcount++;
				Scase = Scase + a;

			}

		}

		System.out.println("Uppercase:" + UCase + ", count:" + Ucount);
		System.out.println("Lowercase:" + Lcase + ", count:" + Lcount);
		System.out.println("number:" + Number + ", count:" + Numcount);
		System.out.println("Specialcase:" + Scase + ", count:" + SPLcount);

	}
}