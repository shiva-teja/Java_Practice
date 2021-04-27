package makeSeleniumEasy;

public class Swap_wo_specialchars {

	public static void reverse(char[] ch)
	{
		int l=0;
		int r=ch.length-1;
		while(l<r)
		{
			if(!Character.isAlphabetic(ch[l]))
			{
				l++;
			}
			else if(!Character.isAlphabetic(ch[r]))
			{
				r--;
			}
			else {
				char tmp=ch[l];
				ch[l]=ch[r];
				ch[r]=tmp;
				l++;
				r--;
			}
		}
	}

	public static void main(String[] args) {
		String str = "a!!!b.c.d,e'f,ghi"; 
		char[] charArray = str.toCharArray(); 

		System.out.println("Input string: " + str); 
		reverse(charArray);
		String revStr = new String(charArray); 

		System.out.println("Output string: " + revStr); 

	}

}
