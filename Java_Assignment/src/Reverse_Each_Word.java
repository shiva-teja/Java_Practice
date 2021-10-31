package example;

public class Reverse_Each_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="shiva teja tadaka";
		String[] sp=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for(String ss:sp)
		{
			for(int i=ss.length()-1;i>=0;i--)
			{
				sb.append(ss.charAt(i));
			}
			sb.append(" ");
		}
		System.out.println(sb);
		

	}

}
