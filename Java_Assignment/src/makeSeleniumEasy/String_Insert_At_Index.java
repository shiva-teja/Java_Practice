package makeSeleniumEasy;

public class String_Insert_At_Index {

	public static void main(String[] args) {
		int k=2;
		String s1="Shivateja";
		String s2="Tadaka";
		StringBuilder sb=new StringBuilder();
		sb.append(s1.substring(0, k+1)).append(s2).append(s1.substring(k+1));
		System.out.println(sb);
	}

}
