package code2;

import java.util.Arrays;

public class Printduplicateelearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,2,3,4,4,5,5,1,2,1,2,3,6};
		Arrays.sort(a);
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			}

		}
		a[j++]=a[a.length-1];
		
		 for (int i=0; i<j; i++)  {
	           System.out.print(a[i]+" ");  
	    } 

	}
}
