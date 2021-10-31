package example;

public class Palindrome {

	public static void main(String[] args) {
		if(palin("abba"))
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("false");
		}
		
	}
	public static boolean palin(String s)
	{
		
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
