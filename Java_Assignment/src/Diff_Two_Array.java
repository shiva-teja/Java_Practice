package example;

import java.util.Scanner;

public class Diff_Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int[] a1=new int[n1];
		for(int i=0;i<n1;i++)
		{
			a1[i]=scn.nextInt();
		}
		int n2=scn.nextInt();
		int[] a2=new int[n2];
		for(int i=0;i<n2;i++)
		{
			a2[i]=scn.nextInt();
		}
		int[] ans=diff_array(a1,a2);
		
		int fnz=-1;
		for(int i=0;i<ans.length;i++)
		{
			if(ans[i]!=0)
			{
				fnz=i;
				break;
			}
		}
		if(fnz ==-1)
		{
			System.out.println(0);
			return;
		}
		
		for(int i=fnz;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
		

	}

	private static int[] diff_array(int[] a1, int[] a2) {
		int[] ans=new int[a2.length];
		int i=a2.length-1;
		int j=a1.length-1;
		int k=ans.length-1;
		
		int borrow=0;
		while(i>=0)
		{
			int sub=a2[i]+borrow;
			if(j>=0)
			{
				sub-=a1[j];
			}
			int val=sub;
			if(sub<0)
			{
				borrow=-1;
				val=val+10;
			}
			else {
				borrow=0;
			}
			ans[k]=val;
			i--;
			j--;
			k--;
			
		}
		
		
		return ans;
	}
	

}
