package makeSeleniumEasy;

public class String_Occurence_Of_AllChars {
	static String str="Shivateja";
	public static void main(String[] args) {
		charfreq(str);
	}
	private static void charfreq(String str2) {
		str2=str2.replace(" ", " ");
		while(str2.length()>0)
		{
			char ch=str2.charAt(0);
			System.out.println("Character "+ch+" occurs "+charcount(str2,ch)+" times");
			str2=str2.replace(ch+"", "");
		}
	}
	static int charcount(String str,char c)
	{
		int count=0;
		while(str.indexOf(c)!=-1)
		{
			count++;
			str=str.substring((str.indexOf(c)+1));
		}
		return count;
	}

}
