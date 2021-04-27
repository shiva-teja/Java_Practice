package makeSeleniumEasy;

public class String_Invert_Case {

	public static void main(String[] args) {

		String name="SHiVAtEjA";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<name.length();i++)
		{
			if(Character.isUpperCase(name.charAt(i)))
			{
				sb.append(Character.toLowerCase(name.charAt(i)));
			}
			else {
				sb.append(Character.toUpperCase(name.charAt(i)));
			}
		}
		System.out.println(sb);
	}

}
