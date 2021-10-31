package example;

public class Max_Freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ooooiiiiiiaaaaaa";
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i)-'a']++;
		}
		char max_char = s.charAt(0);
		int max = -1;
		for (int i = 0; i < s.length(); i++) {
			if (max < freq[s.charAt(i)-'a']) {
				max=freq[s.charAt(i)-'a'];
				max_char=s.charAt(i);
			}
		}
		System.out.println(max+"-------"+max_char);

	}

}
