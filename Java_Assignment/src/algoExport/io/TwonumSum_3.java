package algoExport.io;

import java.util.Arrays;
import java.util.Hashtable;

public class TwonumSum_3 {

	public static void main(String[] args) {
		int arr[]= {3,5,-4,8,11,1,-1,6};
		int target=10;
		int a[]=twonumsum(arr,target);
		for (int i = 0; i < a.length; i++)   
			System.out.print( a[i]+ " ");
	}
	public static int[] twonumsum(int[] arr,int target)
	{
		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++)   
//			System.out.print( arr[i]+ " ");
		int a[] = new int[2];
		int left=0;
		int right=(arr.length)-1;
		while (left<right)
		{
//			int current_sum=arr[left]+arr[right];
			if((arr[left]+arr[right])==target)
			{
				a[0]=arr[left];
				a[1]=arr[right];
				return a;
			}
			else if((arr[left]+arr[right])<target)
				left++;
			else
				right--;
		}
		return a;
	}


}
