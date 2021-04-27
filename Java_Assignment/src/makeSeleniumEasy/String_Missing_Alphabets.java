package makeSeleniumEasy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class String_Missing_Alphabets {

	public static void main(String[] args) {
		String str="wujhdadnbwjoe";
		String alphabets="abcdefghijklmnopqrstuvwxyz";
		String[] strarr=str.split("");
		String[] alphabetsarr=alphabets.split("");
		Set<String> set1=new HashSet<>(Arrays.asList(strarr));
		Set<String> set2=new HashSet<>(Arrays.asList(alphabetsarr));
		set2.removeAll(set1);
		System.out.println(set2);
	}

}
