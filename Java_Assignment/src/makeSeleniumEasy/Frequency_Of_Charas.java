package makeSeleniumEasy;

public class Frequency_Of_Charas {
	static final int ASCII=256;
	public static void main(String[] args) {
		String str="ShivatejaTadaka";
		freq_of_each_char(str);
	}
	static void freq_of_each_char(String str)
	{
		str=str.toLowerCase();
		int count[]=new int[ASCII];
		int len=str.length();

		for(int i=0;i<len;i++)
			count[str.charAt(i)]++;

		char[] ch=new char[str.length()];
		for(int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
			int find=0;
			for(int j=0;j<=i;j++)
			{
				if(str.charAt(i)==ch[j])
					find++;
			}
			if(find==1)
			{
				System.out.println("Character "+str.charAt(i)+" occurred "+count[str.charAt(i)]+" time");
			}
		}

	}

}
