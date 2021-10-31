package example;

public class Move_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,0,1,9,0,2,1};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[count++]=a[i];
			}
		}
		while(count<a.length)
		{
			a[count++]=0;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
