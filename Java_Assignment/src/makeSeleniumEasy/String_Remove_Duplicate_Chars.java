package makeSeleniumEasy;

import java.util.HashSet;
import java.util.Set;

public class String_Remove_Duplicate_Chars {
	static String str="shivateja";
	
	public static void main(String[] args) {
		without_collection(str);
		System.out.println();
		with_collection(str);
		
	}
	static void without_collection(String str) {
		StringBuilder sb=new StringBuilder();
		for(char c:str.toCharArray())
		{
			if(sb.indexOf(Character.toString(c))==-1)
			{
				sb.append(c);
			}
		}
		System.out.print(sb);
	}
	
	static void with_collection(String str) {
		Set<Character> st=new HashSet<>();
		for(char c:str.toCharArray())
		{
			st.add(c);
		}
//		System.out.println(st.toString());
		String str1=st.toString();
		str1=str1.substring(1,str1.length()-1);
		str1=str1.replaceAll(",", "");
		str1=str1.replace(" ", "");
		System.out.println(str1);
	}

}
