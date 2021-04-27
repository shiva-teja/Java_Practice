package code2;

import java.util.Scanner;

public class BinaryDP {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter value of ");
		int input=scn.nextInt();
		int ans=cbs(input);
		System.out.println(ans);
	}

	private static int cbs(int input) {
		int ozero=1;
		int oone=1;
		for(int i=2;i<=input;i++)
		{
			int nzero=oone;
			int none=ozero+oone;
			
			ozero=nzero;
			oone=none;
		}
		
		
		return ozero+oone;
	}

}
