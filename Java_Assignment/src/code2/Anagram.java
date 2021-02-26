package code2;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		String s="ShivatejaTadaka";
		char[] chararr=s.toCharArray();
		for(char c:chararr)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		HashMap<Character, Integer> hm2=new HashMap<Character, Integer>();
		String s2="ShivatejaTadaka";
		char[] chararr2=s2.toCharArray();
		for(char c:chararr2)
		{
			if(hm2.containsKey(c))
			{
				hm2.put(c, hm2.get(c)+1);
			}
			else {
				hm2.put(c, 1);
			}
		}
		if(hm.equals(hm2))
		{
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}

	}

}
