package makeSeleniumEasy;

public class String_Reverse_Position {

	public static void main(String[] args) {
		String str="You are Welcome";
		String[] st=str.split(" ");
		for(String s:st)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
