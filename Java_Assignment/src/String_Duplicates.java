package example;

import java.util.HashSet;
import java.util.Set;

public class String_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbbcccdeeej";
		char[] ch=s.toCharArray();
		Set<Character> st=new HashSet<Character>();
		for(char c:ch)
		{
			st.add(c);
		}
		System.out.println(st);

	}

}
