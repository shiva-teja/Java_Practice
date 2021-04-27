package code2;

public class Eachwordreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I am Shivateja";
		String[] news=s.split(" ");
		String Reverse="";
		StringBuilder sb=new StringBuilder();
		for(String w:news)
		{
//			StringBuilder sb=new StringBuilder(w);
//			sb.reverse();
//			Reverse+=sb.toString()+" ";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				sb.append(w.charAt(i));
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}
	

}
