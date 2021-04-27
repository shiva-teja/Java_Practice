package makeSeleniumEasy;

public class Middlethreechars {

	public static void main(String[] args) {
		String s="Candy";

//		Using Inbuilt Function
		//		System.out.println(s.substring(1, 4));

// Without Inbuilt Function
		if(s.length()<3)
		{
			return;
		}
		else {
			char[] c=s.toCharArray();
			for(int i=1;i<4;i++)
			{
				System.out.print(c[i]);
			}
		}
	}

}
