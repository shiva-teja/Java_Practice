package code2;

import java.util.Scanner;

public class Sum_dig_Dp {
	static int[][] dp=new int[101][501];

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Vlaue for N: ");
		int N=scn.nextInt();
		System.out.println("Enter Vlaue for Sum: ");
		int Sum=scn.nextInt();
//		System.out.println(FinalCount(N, Sum));
	}
	static int CountRec(int n, int sum) {
		int ans=0;
		if(n==0)
			return sum==0?1:0;
		if(dp[n][sum]!=-1)
			return dp[n][sum];
		for(int i=0;i<=9;i++)
		{
			if(sum-i>=0)
			{
				ans+=CountRec(n-1,sum-i);
			}
		}
		return ans;
	}
	static int finalcount(int n,int sum)
	{
		int ans=0;
		for(int i=0;i<=100;i++)
		{
			for(int j=0;j<=500;j++)
			{
				dp[sum][n]=-1;
			}
		}
		if(n==0)
			return sum==0?1:0;
		for(int i=1;i<=9;i++)
		{
			if(sum-1>=0)
				ans+=CountRec(n, sum);
		}
		return ans;
	}

}
