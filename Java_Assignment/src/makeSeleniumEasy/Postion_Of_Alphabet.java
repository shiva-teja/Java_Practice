package makeSeleniumEasy;

public class Postion_Of_Alphabet {

	public static void main(String[] args) {
		String name="Shivateja";
		char ch[]=name.toCharArray();
		for(char c:ch)
		{
			char newc=Character.toLowerCase(c);
			int ascii=(int)(newc);
			int position=ascii-96;
			System.out.println("Character "+c+"'s "+position);}
	}

}
