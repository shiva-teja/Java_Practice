package code2;

public class Eleatoddpos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,2,3,4,4,5,5,1,2,1,2,3};
		for(int i=0;i<a.length;i++)
		{
//			i=i+1;
			if(!(i % 2 == 0))
			{
				System.out.println("Element at "+i+" "+a[i]);
			}
		}

	}

}
