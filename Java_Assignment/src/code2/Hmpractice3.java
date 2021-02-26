package code2;

import java.util.HashMap;
import java.util.Scanner;

public class Hmpractice3 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int[] a1=new int[n1];
		for (int i=0;i<n1;i++)
		{
			a1[i]=scn.nextInt();
		}

		int n2=scn.nextInt();
		int[] a2=new int[n2];
		for (int i=0;i<n2;i++)
		{
			a2[i]=scn.nextInt();
		}
		
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int val:a1)
		{
			hm.put(val, hm.getOrDefault(hm, 0)+1);
		}
		for(int val:a2)
		{
			if(hm.containsKey(val))
			{
				hm.remove(val);
				System.out.println(val);
			}
		}
	}

}
