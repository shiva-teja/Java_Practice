package algoExport.io;

import java.util.Arrays;

public class SortedSquares_2 {

	public static void main(String[] args) {

			int arr[]= {-4,-2,0,1,3,9};
			
			int a[]=sortedsquares(arr);
			for (int i = 0; i < a.length; i++)   
				System.out.print( a[i]+ " ");  
		}
		public static int[] sortedsquares(int[] arr)
		{
			int[] sortedarr=new int[arr.length];
			int s_index=0;
			int l_index=arr.length-1;
			for(int i=arr.length-1;i>=0;i--)
			{
				int s_value=arr[s_index];
				int l_value=arr[l_index];
				if(Math.abs(s_value)>Math.abs(l_value))
				{
					sortedarr[i]=s_value*s_value;
					s_index++;
				}
				else {
					sortedarr[i]=l_value*l_value;
					l_index--;
				}
			}
			return sortedarr;
		}
		

}
