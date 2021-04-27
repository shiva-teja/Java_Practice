package makeSeleniumEasy;

import java.util.HashSet;
import java.util.Set;

public class Common_Elements_Array {

	public static void commonele(String[] Arr1,String[] Arr2)
	{
		Set<String> set=new HashSet<>();
		for(int i=0;i<Arr1.length;i++)
		{
			for(int j=0;j<Arr2.length;j++)
			{
				if(Arr1[i]==Arr2[j])
				{
					set.add(Arr1[i]);
				}
			}
		}
		for(String i:set)
		{
			System.out.println(i+" ");
		}
	}



	public static void main(String[] args) {

		String[] arr1= { "Article", "in", "Geeks", "for", "Geeks" };

		String[] arr2 = { "Geeks", "for", "Geeks" };
		
		commonele(arr1,arr2);
		
	}

}
