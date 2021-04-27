package makeSeleniumEasy;

public class String_Circular {

	public static void main(String[] args) {
		String str="Hi Hello How are you";
		int pos=3;
//		for(int i=0;i<pos;i++)
//			rotate(str);
		String[] s=str.split(" ");
		if(pos>=0 && pos<s.length)
		{
			for(int i=pos;i<s.length;i++)
			{
				System.out.print(s[i]+" ");
			}
			for(int k=0;k<pos;k++)
			{
				System.out.print(s[k]+" ");
			}
		}
		else {
			System.out.println();
		}
		
		
		
	}
	public static void rotate(String s)
	{
		String[] str=s.split(" ");
		String temp=str[0];
		int i;
		for(i=0;i<str.length-1;i++)
		
			str[i]=str[i+1];
		
		str[i]=temp;
		for(int j=0;i<str.length;i++)
		{
			System.out.println(str[j]);
		}
	}


}
