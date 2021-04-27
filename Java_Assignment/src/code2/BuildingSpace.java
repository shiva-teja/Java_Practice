package code2;

import java.util.Scanner;

public class BuildingSpace {

	public static void main(String[] args) {
Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter value of ");
		int input=scn.nextInt();
		long ans=buildspace(input);
		System.out.println(ans);
	}

	private static long buildspace(int input) {
		int ob=1;
		int os=1;
		for(int i=2;i<=input;i++)
		{
			int nb=os;
			int ns=ob+os;
			
			ob=nb;
			os=ns;
		}
		
		int ways= os+ob;
		long ans=ways*(long)(ways);
		return ans;
	}

}
