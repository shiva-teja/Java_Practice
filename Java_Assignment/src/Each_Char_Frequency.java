package example;

import java.util.HashMap;
import java.util.Map;

public class Each_Char_Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="shivateja";
		without_collection(s);
		

	}
	static void without_collection(String s)
	{
		int[] Freq_Array=new int[256];
		for(char c:s.toCharArray())
		{
			Freq_Array[c]++;
		}
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
			int find=0;
			for(int j=0;j<=i;j++)
			{
				if(s.charAt(i)==ch[j])
				{
					find++;
				}
			}
			if(find==1)
			{
				System.out.println("Character "+s.charAt(i)+" occured "+Freq_Array[s.charAt(i)]+ " times");
			}
		}
	}
	
	
	
	
	
	static void with_Collection(String s)
	{
		HashMap<Character,Integer>hm=new HashMap<>();
		for(char c:s.toCharArray())
		{
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character,Integer> en:hm.entrySet())
		{
			System.out.println(en.getKey()+ " has occured "+en.getValue());
		}
	}

}
