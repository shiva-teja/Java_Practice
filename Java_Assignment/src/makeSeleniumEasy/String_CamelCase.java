package makeSeleniumEasy;

public class String_CamelCase {
	static String str="shiva teja tadaka";
	public static void main(String[] args) {
		camelcase(str);
	}
	static void camelcase(String s)
	{
		StringBuilder sb=new StringBuilder();
		String[] str=s.split(" ");
		for(String ss:str)
		{
			sb.append(ss.substring(0, 1).toUpperCase()).append(ss.substring(1));
		}
		System.out.println(sb);
	}

}
