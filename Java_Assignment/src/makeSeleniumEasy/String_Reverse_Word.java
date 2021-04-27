package makeSeleniumEasy;

public class String_Reverse_Word {

	public static void main(String[] args) {
		String str="Hello New World";
		String[] strarr=str.split(" ");
		for(int i=strarr.length-1;i>=0;i--)
		{
			System.out.print(strarr[i]+" ");
		}
	}

}
