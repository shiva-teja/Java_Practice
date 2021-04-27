package makeSeleniumEasy;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sum {
	public static void arr_sum(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==10)
				{
					System.out.println("Indices are"+i+" "+j);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,2,3,4,5,6,7,8,9};
		arr_sum(arr1);
		

	}

}
