package code2;

import java.util.Scanner;

public class Sum_dig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Vlaue for N: ");
		int N=scn.nextInt();
		System.out.println("Enter Vlaue for Sum: ");
		int Sum=scn.nextInt();
		System.out.println(FinalCount(N, Sum));

	}
	static int countRec(int n, int sum)
	{
		if(n==0)
			return sum==0?1:0;
		int ans=0;
		for(int i=0;i<=9;i++)
		{
			if(sum-i>=0)
			{
				ans+=countRec(n-1,sum-i);

			}
		}
		return ans;

	}
	static int FinalCount(int n, int sum)
	{
		int ans=0;
		for(int i=1;i<=9;i++)
		{
			if(sum-i>=0)
			{
				ans+=countRec(n-1,sum-i);

			}
		}
		return ans;

	}

}
