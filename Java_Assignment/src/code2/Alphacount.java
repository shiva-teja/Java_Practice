package code2;

public class Alphacount {

	public static void main(String[] args) {
		String s="abbcccddddefghijjjjjjjjjj";
		StringBuffer sb=new StringBuffer("");
		for(int i=0;i<s.length();i++)
		{
			int charcount=1;
			 while(i+1<s.length() && s.charAt(i) == s.charAt(i+1)) {
				 charcount++;
		            i++;
		        }
			sb.append(s.charAt(i)).append(charcount);
		}
		System.out.println(sb);
			
	}

}
