package example;

public class CharNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaaabbbbbcccccccccddddee";
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			while((i+1)<s.length()&& s.charAt(i)==s.charAt(i+1))
					{
						count++;
						i++;
					}
			System.out.print(s.charAt(i)+""+count);
		}

	}

}
