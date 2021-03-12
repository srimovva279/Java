package org.KANNAN.prgm4;

public class ShortAssendingOrder24 {

	public static void main(String[] args) {
		String s="goodday";
		char[] ch = s.toCharArray();
		
		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			
		}
		String sorted=new String(ch);
		System.out.println(sorted);
	}
}
