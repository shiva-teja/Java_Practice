package code2;

import java.util.HashMap;
import java.util.Scanner;

public class Hmpractice5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int[] a1=new int[n1];
		for (int i=0;i<n1;i++)
		{
			a1[i]=scn.nextInt();
		}
		HashMap<Integer, Boolean>hm=new HashMap<Integer, Boolean>();
		for(int val:a1)
		{
			hm.put(val, true);
		}
		for(int val:hm.keySet())
		{
			if(hm.containsKey(val-1))
			{
				hm.put(val, false);
			}
		}
		int ml=0;
		int msp=0;
		for(int val:a1)
		{
			if(hm.get(val)==true)
			{
				int tl=1;
				int tsp=val;
				while(hm.containsKey(tsp+tl))
				{
					tl++;
				}
				if(tl>ml)
				{
					msp=tsp;
				}
			}
		}

	}

}
