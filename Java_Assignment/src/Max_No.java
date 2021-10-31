package example;

public class Max_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,1,0,3,9};
		System.out.println(maxele(arr));

	}
	
	public static int maxele(int[] a)
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}

}
