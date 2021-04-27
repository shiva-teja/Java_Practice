package code2;

public class Index_of_first1 {

	public static void main(String[] args) {

		int[] arr={0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
		System.out.println(index(arr));
		
	}
	public static int index(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
				return i;
		}
		
		return -1;
		
	}

}
