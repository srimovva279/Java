package org.KANNAN.prgm4;

public class WithASCI22 {

	public static void main(String[] args) {
		
		String email="KannanDev1235@gmail.com";
		
		String UCase="";
		String Lcase="";
		String Scase="";
		String Number="";
		
		 int Ucount=0;
		 int Lcount=0;
		 int SPLcount=0;
		 int Numcount=0;
		 
		 
		 char[] ch = email.toCharArray();
		 
		 for (char c : ch) {
			
			 if(c>=65&&c<=90) {
				 
				 Ucount++;
				 UCase=UCase+c;
			 }
			 else if(c>=97&&c<=122) {
				 Lcount++;
				 Lcase=Lcase+c;
			 }
			 else if(c>=48&&c<=57) {
				 
				 Numcount++;
				 Number=Number+c;
			 }
			 else {
				 SPLcount++;
				 Scase=Scase+c;
			 }
		}
		 
		 
		 System.out.println("Uppercase:"+UCase+", count:"+Ucount);
		 System.out.println("Lowercase:"+Lcase+", count:"+Lcount);
		 System.out.println("number:"+Number+", count:"+Numcount);
		 System.out.println("Specialcase:"+Scase+", count:"+SPLcount);

	}

}
