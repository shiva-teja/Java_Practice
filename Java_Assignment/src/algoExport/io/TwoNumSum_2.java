package algoExport.io;

import java.util.Hashtable;

public class TwoNumSum_2 {

	public static void main(String[] args) {
		int arr[]= {3,5,-4,8,11,1,-1,6};
		int target=10;
		int a[]=twonumsum(arr,target);
		for (int i = 0; i < a.length; i++)   
			System.out.print( a[i]+ " ");

		
	}
	public static int[] twonumsum(int[] arr,int target)
	{
		Hashtable<Integer, Boolean> ht=new Hashtable<>();
		int a[] = new int[2];
		int y=0;
//		int x=0;
		for(int i=0;i<arr.length-1;i++)
		{
			y=target-arr[i];
			if(ht.containsKey(y))
			{
				a[0]=arr[i];
				a[1]=y;
			}
			else {
				ht.put(arr[i], true);
			}
		}
		return a;
	}

}
