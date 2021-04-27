package makeSeleniumEasy;

public class String_Occurence_Of_Char {
	static String str="Shivateja";
	public static void main(String[] args) {
		int finalstr=charCount(str,'a');
		System.out.println(finalstr);
	}
	static int charCount(String str,char c) {
		str=str.toUpperCase();
		c=Character.toUpperCase(c);
		int intialcount=str.length();
		str=str.replace(c+"", "");
		int finalcount=str.length();
		
		return intialcount-finalcount;
		
		
	}

}
