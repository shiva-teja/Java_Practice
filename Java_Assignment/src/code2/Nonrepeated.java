package code2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Nonrepeated {
	public static void main(String[] args) {
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		String s="Hello";
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
		for(Entry<Character, Integer> e:hm.entrySet())
		{
			if(e.getValue()==1)
			{
				System.out.println(e.getKey());
			}
		}
		for(Map.Entry<Character, Integer> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
			if(entry.getValue()==2)
			{
				System.out.println(entry.getKey());
			}
		}
	}

}
