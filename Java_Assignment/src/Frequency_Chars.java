package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequency_Chars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Narayana Sharma";
		char[] c=s.toLowerCase().replace(" ","").toCharArray();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char ch:c)
		{
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		System.out.println(hm);
		for(Entry<Character, Integer> mp:hm.entrySet())
			
		{
			if(mp.getValue()>1)
			System.out.println("Character "+mp.getKey()+" Occurred "+mp.getValue());
		}
	}
	

}
