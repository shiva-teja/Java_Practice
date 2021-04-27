package makeSeleniumEasy;

import java.util.HashMap;

public class String_Anagrams {

	public static void main(String[] args) {
		String name1="Shiva";
//		String name2="Teja";
		String name2="Shiva";
		if(name2.length()!=name2.length())
		{
			System.out.println("Not Anagram");
		}
		HashMap<Character,Integer> hm1=new HashMap<>();
		for(char c:name1.toCharArray())
		{
			hm1.put(c, hm1.getOrDefault(c, 0)+1);
		}
		HashMap<Character,Integer> hm2=new HashMap<>();
		for(char c:name2.toCharArray())
		{
			hm2.put(c, hm2.getOrDefault(c, 0)+1);
		}	
		if(hm1.equals(hm2))
		{
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}
