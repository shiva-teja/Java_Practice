package makeSeleniumEasy;

import java.util.HashSet;
import java.util.Set;

public class String_Common_Characters {

	public static void main(String[] args) {
		String str1="shivateja";
		String str2="tadaka";
				with_collections(str1, str2);
		without_collections(str1, str2);



	}

	public static void with_collections(String str1,String str2)
	{
		Set<Character> s1=new HashSet<>();
		Set<Character> s2=new HashSet<>();
		for(char c:str1.toCharArray())
		{
			s1.add(Character.toLowerCase(c));	
		}
		for(char c:str2.toCharArray())
		{
			s2.add(Character.toLowerCase(c));	
		}
		System.out.println(s1+" "+s2);
		System.out.println(s1.retainAll(s2));
		StringBuilder sb=new StringBuilder();
		for(Character c:s1)
		{
			sb.append(c);
		}
		System.out.println(sb);

	}

	public static void without_collections(String str1,String str2)
	{
		StringBuilder sb=new StringBuilder();
		if(str1.length()>0 && str2.length()>0)
		{
			String toBeIterated=(str1.length()>str2.length()?str1:str2);
			String toBeChecked=(toBeIterated.equals(str1)?str2:str1);
			System.out.println("String to be iterated: " + toBeIterated);
			System.out.println("String to be checked: " + toBeChecked);
			for(int i=0;i<toBeIterated.length();i++)
			{
				if(toBeChecked.contains(Character.toString(toBeIterated.charAt(i))))
					sb=sb.append(Character.toString(toBeIterated.charAt(i)));
			}
			System.out.println(sb);	
		}
		else {
			System.out.println("");
		}
		
	}

}
