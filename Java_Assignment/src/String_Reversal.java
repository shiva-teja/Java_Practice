package example;

public class String_Reversal {

	public static void main(String[] args) {

		String s = "abctqtqt";
		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = ch.length - 1; i >= 0; i--) {
			sb.append(ch[i]);
		}
		System.out.println(sb);
	}

}
