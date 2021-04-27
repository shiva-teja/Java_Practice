package makeSeleniumEasy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class STring_Distinct_Chars {
	static String str="shivateja";
	public static void main(String[] args) {
		with_collection(str);
		System.out.println();
		without_collection(str);
		
	}
	private static void without_collection(String str2) {
		str2.replaceAll(" ","");
		str2=str2.toUpperCase();
		while(str2.length()>0)
		{
			char c=str2.charAt(0);
			if(str2.lastIndexOf(c)==0)
			{
				System.out.print(c+" ");
			}
			str2=str2.replace(Character.toString(c), "");
		}
	}
	private static void with_collection(String str2) {
		HashMap<Character,Integer> map=new HashMap<>();
		for(char c:str.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.print(entry.getKey()+" ");
			}
		}
		
	}


}
