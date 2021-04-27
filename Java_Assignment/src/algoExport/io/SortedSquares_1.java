package algoExport.io;

import java.util.Arrays;


public class SortedSquares_1 {

	public static void main(String[] args) {

		int arr[]= {-4,-2,0,1,3,9};
		
		int a[]=sortedsquares(arr);
		for (int i = 0; i < a.length; i++)   
			System.out.print( a[i]+ " ");  
	}
	public static int[] sortedsquares(int[] arr)
	{
		int[] sortedarr=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			sortedarr[i]=arr[i]*arr[i];
		}
		Arrays.sort(sortedarr);
		
		return sortedarr;
	}

}
