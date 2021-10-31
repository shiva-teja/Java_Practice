package example;

public class Vowel_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		char[] ch = s.toCharArray();
		vowel(ch);

	}

	public static void vowel(char[] ch) {
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			if (i < ch.length && !isVowel(ch[i])) {
				i++;
			} else if (j >= 0 && !isVowel(ch[j])) {
				j--;
			} else {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
		}

		for (int k = 0; k < ch.length; k++) {
			System.out.print(ch[k]);
		}
	}

	private static boolean isVowel(char c) {
		// TODO Auto-generated method stub
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U');

	}

}
