package makeSeleniumEasy;

public class String_Remove_WhiteSpace {
	static String str="    Shiva    teja    ";
	//Shiva teja
	public static void main(String[] args) {
		String sb="";
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{

			if(ch[i]==' ')
			{
				if(!(sb.length()==0))
				{
					if(ch[i+1]!=' ')
					{
						sb=sb+ch[i];
					}
				}
			}
			else {
				sb=sb+ch[i];
			}
		}
		System.out.println(sb);
	}



}
