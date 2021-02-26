package code2;

import java.util.ArrayList;

public class ALtoSTring {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("");
		ArrayList<String> al=new ArrayList<>();
		al.add("Hi");
		al.add("This");
		al.add("is");
		al.add("Shivateja");
		for(String name:al)
		{
			sb.append(name).append(',');
		}
		System.out.println(sb.toString());
		String news=sb.toString();
		if(sb.length()>0)
		{
			news=news.substring(0, sb.length()-1);
			System.out.println(news);
		}
		
	}

}
