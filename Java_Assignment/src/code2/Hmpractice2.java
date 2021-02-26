package code2;

import java.util.HashMap;
import java.util.Scanner;

public class Hmpractice2 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		System.out.println(str);
		
		String[] str1=str.split(" ");
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(String keys:str1)
		{
			hm.put(keys, hm.getOrDefault(keys, 0)+1);
		}
		System.out.println(hm);
		
		String mfw=str1[0];
		for(String key:hm.keySet())
		{
			if(hm.get(key)>hm.get(mfw))
			{
				mfw=key;
			}
		}
		System.out.println();
	}
	

}
