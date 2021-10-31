package example;

import java.util.Scanner;

public class Right_Rotate_Array {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int[] a1 = new int[n1];

		for (int i = 0; i < n1; i++) {
			a1[i] = scn.nextInt();
		}
		rotate(a1,2);
		print_array(a1);
	}
	
	public static void rotate(int[] a,int k)
	{
		int n=a.length;
		while(k>n)
		{
			k=k-n;
		}
		
		int[] temp=new int[n-k];
		for(int i=0;i<n-k;i++)
		{
			temp[i]=a[i];
		}
		for(int i=n-k;i<n;i++)
		{
			a[i-n+k]=a[i];
		}
		for(int i=0;i<n-k;i++)
		{
			a[i+k]=temp[i];
		}
	}
	
	public static void print_array(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
//			Input arr[] = [1, 2, 3, 4, 5], D = 2
//			1) Store the first d elements in a temp array
//			   temp[] = [1, 2, 3]
//			2) Shift rest of the arr[]
//			   arr[] = [4, 5]
//			3) Store back the D elements
//			   arr[] = [4, 5, 1, 2, 3]

}
