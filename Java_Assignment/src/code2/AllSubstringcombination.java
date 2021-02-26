package code2;

import java.util.ArrayList;

public class AllSubstringcombination {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		String s="Shivateja";
		int stringLength = s.length(); 
		for(int i=0;i<stringLength;i++)
		{
			for(int j=i+1;j<=stringLength;j++)
			{
				al.add(s.substring(i, j));
			}
		}
		System.out.println(al);
	}

}
