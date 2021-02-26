package code2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Singlequotetext {

	public static void main(String[] args) {
		String s="This is 'Shivateja'";
//		char[] c=s.toCharArray();
//		for(int i=0;i<c.length;i++)
//		{
//			
//		}
		
		
		
		
		
		System.out.println(s);
		Pattern p=Pattern.compile(".*'([^']*)'.*");
		Matcher m1=p.matcher(s);
		if(m1.matches())
		{
			System.out.println(m1.group(1));
		}
	}

}
