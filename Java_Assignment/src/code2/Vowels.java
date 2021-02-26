package code2;

public class Vowels {

	public static void main(String[] args) {
		String s="Shivateja";
		String news=s.toLowerCase();
		int count=0;
		System.out.println(s.toLowerCase());
		for(int i=0;i<news.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
