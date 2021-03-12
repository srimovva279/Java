package Practice;

public class pac {

	public static void main(String[] args) {

		String s = "srikanth";

		String reverse = "";

		for (int i = s.length()-1; i >= 0; i--) {

			char c = s.charAt(i);

			reverse = reverse + c;

		}
		System.out.println(reverse);
	}
}
