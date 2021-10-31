package example;

public class Second_Largest {

	public static void main(String[] args) {

		int[] a= {1,9,6,4,9,7,7};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				smax=max;
				max=a[i];
			}
			if(max>a[i] && smax<a[i])
			{
				smax=a[i];
			}
		}
		System.out.println(smax);
	}

}
