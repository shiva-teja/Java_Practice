package example;

public class Dry_run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,9,1,4,15};
		print_arr(arr);
		System.out.println("----------------");
		find_max(arr);
		print_arr(arr);
		
		
		

	}
	
	static void find_max(int[] a)
	{
		int n=a.length;
		int temp=a[n-1];
		a[n-1]=-1;
		for(int i=n-2;i>=0;i--)
		{
			int x=a[i];
			a[i]=Math.max(a[n-1], temp);
			temp=x;
		}
	}

	public static void print_arr(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
