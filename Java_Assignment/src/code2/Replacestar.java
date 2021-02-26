package code2;

public class Replacestar {

	public static void main(String[] args) {
		String str= "i am shiva";
		StringBuilder sb=new StringBuilder(str.replaceFirst(" ", ""));
		for(int i=1;i<=sb.length()-1;i++)

		{
			if(!(i%2==0))
				sb.setCharAt(i, '*');
		}
		System.out.println(sb);
	}

}
