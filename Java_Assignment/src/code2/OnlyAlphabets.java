package code2;

public class OnlyAlphabets {

	public static void main(String[] args) {
		String s="H232e09llo33@&%#";
		s=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
	}
}
