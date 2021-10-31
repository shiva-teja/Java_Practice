package example;

public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,6,3,15,3};
		int[] a_out=max_min_arr(arr);
		print_array(a_out);
	}

	private static int[] max_min_arr(int[] arr) {
		// TODO Auto-generated method stub
		int[] a_out= new int[2];
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		a_out[0]=max;
		a_out[1]=min;
		
		return a_out;

}
	
	public static void print_array(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
