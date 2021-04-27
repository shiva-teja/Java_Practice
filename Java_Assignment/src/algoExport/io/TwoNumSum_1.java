package algoExport.io;

import java.util.Scanner;

public class TwoNumSum_1 {

	public static void main(String[] args) {
				Scanner scn =new Scanner(System.in);
				System.out.println("Enter size of Array:");
				int n=scn.nextInt();
		        int arr[] = new int[n];
				System.out.println("Enter Array Elements:");
				for(int i=0;i<n;i++)
				{
					arr[i]=scn.nextInt();
				}
				System.out.println("Enter Target Sum:");
				int target=scn.nextInt();
//		int arr[]= {3,5,-4,8,11,1,-1,6};
//		int target=10;
		int a[]=twonumsum(arr,target);
		for (int i = 0; i < a.length; i++)   
			System.out.print( a[i]+ " ");  


	}

	public static int[] twonumsum(int[] arr,int target)
	{
		int a[] = new int[2];

		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]== target)
				{
					//					return new int[]{arr[i],arr[j]};
					a[0]=arr[i];
					a[1]=arr[j];
				}
			}
		}

		return a;

	}

}
