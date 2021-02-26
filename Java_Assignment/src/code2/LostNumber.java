package code2;

public class LostNumber {

	public static void main(String[] args) {
		String s="5 7 4 3 2 6 10 11 12";
		int count=s.split(" ").length-1;
		if(s.indexOf(Integer.toString(count))!=-1)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println("-1");
		}
	}

}
