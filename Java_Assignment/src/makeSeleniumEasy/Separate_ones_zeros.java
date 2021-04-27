package makeSeleniumEasy;

public class Separate_ones_zeros {

	public static void main(String[] args) {
		int[] a= {0,1,1,1,0,1,0,1,0,1};
		display(a);
		int j = -1;
		for (int i = 0; i < a.length; i++) {

			// if number is smaller than 1
			// then swap it with j-th number
			if (a[i] < 1) {
				j++;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
			
		}
		display(a);
	}
	public static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
	}

}
