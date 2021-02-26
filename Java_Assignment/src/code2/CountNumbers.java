package code2;

public class CountNumbers {

	public static void main(String[] args) {
		String s="12345uuajahs";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
