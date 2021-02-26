package code2;

public class Separate {

	public static void main(String[] args) {
		String s="ajajsjsajdasldljsaldsajljdsa";
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		for(char e:s.toCharArray())
		{
			System.out.print(e+" ");
		}
	}

}
