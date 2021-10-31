package example;

import java.util.Arrays;

public class Bar_Chart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 7, 4, 2, 9, 1 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		for (int ht = max; ht >= 1; ht--) {
			System.out.print(ht+":");
			
			for (int k=0;k<arr.length;k++)
			{
				
				if(ht<=arr[k])
				{
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.print("  ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}

	}

}
