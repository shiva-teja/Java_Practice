package example;

public class Remove_Duplicate {

	public static void main(String[] args) {

		String s="shivateja";
		StringBuilder sb=new StringBuilder();
		for(char c:s.toCharArray())
		{
			if(sb.indexOf(Character.toString(c))==-1)
			{
				sb.append(c);
			}
		}
		System.out.println(sb);
		
	}

}
