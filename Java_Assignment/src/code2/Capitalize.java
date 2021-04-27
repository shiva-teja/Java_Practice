package code2;

public class Capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "i am shiva";
		String[] newstr=str.split(" ");
		for(int i=0;i<=newstr.length-1;i++)
		{
			String first=newstr[i].substring(0, 1);
			String rest=newstr[i].substring(1, newstr[i].length());
			first=first.toUpperCase();
			String all=first+rest;
			System.out.print(all+" ");
		}
		
//		StringBuffer sb=new StringBuffer();
//		for(String s:newstr)
//		{
//			sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
//		}
//		System.out.print(sb);

	}

}
