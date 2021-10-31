package example;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="shivateja";
		char[] ch=s.toCharArray();
		HashMap <Character,Integer> hm=new HashMap<>();
		for(char c:ch) {
			hm.put(c,hm.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character,Integer> en:hm.entrySet())
		{
			if(en.getValue()==2)
			{
				System.out.println(en.getKey());
			}
		}

	}

}
