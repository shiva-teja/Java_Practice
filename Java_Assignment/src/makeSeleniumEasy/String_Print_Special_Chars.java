package makeSeleniumEasy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Print_Special_Chars {

	public static void main(String[] args) {
		String str="(^%#^SHiv!@ate#$a";
		Pattern p=Pattern.compile("[!@#$%^&*()]");
		Matcher m=p.matcher(str);
		int count=0;
		while(m.find())
		{
			count+=1;
			System.out.println(str.charAt(m.start())+" found at "+(m.start()+1));
		}
		System.out.println(count);
		System.out.println(str.replaceAll("[^A-Za-z]", ""));
	}

}
