package code2;

public class Toogle {

	public static void main(String[] args) {

		String s="you are the best";
		String[] news=s.split(" ");
		tog(news);
		String Reverse="";
		for(String w:news)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			Reverse+=sb.toString()+" ";
		}
		String[] revnews=Reverse.split(" ");
		tog(revnews);
		
	}
	public static void tog(String[] news)
	{
		for(int i=0;i<news.length;i++)
		{
			String first=news[i].substring(0, 1);
			String last=news[i].substring(1, news[i].length());
			String finals=first+last.toUpperCase();
			System.out.print(finals+" ");
			
		}
		System.out.println(" ");
	}

}
