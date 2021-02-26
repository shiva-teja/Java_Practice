package code2;

public class Wordbyreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i am shiva";
		String[] newstr=str.split(" ");
		for(int i=newstr.length-1;i>=0;i--)
		{
			System.out.print(newstr[i]+" ");
		}
		

	}

}
