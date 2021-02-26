package code2;

public class NewSample {

	public static void main(String[] args) {
		String s="";
		for(char c='a';c<='z';c++)
		{
			s+=c+" ";
		}
		String[] news=s.split(" ");
		for(int i=0;i<26;i++)
		{
			if(i%2==0)
			{
				System.out.print(news[i]);
			}
			else {
				System.out.print(news[i].toUpperCase());
			}
		}
	}

}
