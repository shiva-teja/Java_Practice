package code2;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a= {1,1,2,3,4,4,5,5,1,2,1,2};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
