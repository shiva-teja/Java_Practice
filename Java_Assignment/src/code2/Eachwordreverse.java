package code2;

public class Eachwordreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I am SHivateja";
		String[] news=s.split(" ");
		String Reverse="";
		for(String w:news)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			Reverse+=sb.toString()+" ";
		}
		System.out.println(Reverse);
	}
	

}
