package code2;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Shivateja";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.contentEquals(rev))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Noooooooooo");
		}

	}

}
