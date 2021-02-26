package code2;

public class Repeat {

	public static void main(String[] args) {
		String s="abcd";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(i));
			}
		}
	}

}
