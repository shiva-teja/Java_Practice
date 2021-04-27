package code2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Common_Chars_three_Strings {

	public static void main(String[] args) {

		String s1="dessets";
		String s2="asserts";
		String s3="stressed";
		Set<Character> set1=new HashSet<>();
		Set<Character> set2=new HashSet<>();
		Set<Character> set3=new HashSet<>();
		
		for(char c:s1.toCharArray())
		{
			set1.add(c);
		}
		for(char c:s2.toCharArray())
		{
			set2.add(c);
		}
		for(char c:s3.toCharArray())
		{
			set3.add(c);
		}
		set1.retainAll(set2);
		set1.retainAll(set3);
		
		for(char c : set1) {
            System.out.print(" " + c);
        }
		
		 System.out.println("\nTotal number of common characters: "+ set1.size());
		
	}

}
