package Practice;

public class reverse {

	
	public static void main(String[] args) {
		
		String s="Welcome";
		String reverse="";
		String nword="";
		
		for (int i = s.length()-1; i >=0; i--) {
			
			char charAt = s.charAt(i);
		
			reverse=reverse+charAt;
		}
		
		System.out.println(reverse);
	}
}

