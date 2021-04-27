package code2;

import java.util.HashMap;
import java.util.Map;

public class Countoccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		String s="ShivatejaTadaka";
		char[] chararr=s.toLowerCase().toCharArray();
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
		for(Map.Entry entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
