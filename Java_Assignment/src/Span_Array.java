package example;

public class Span_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,24,1,9,7,13};
		span(a);

	}
	
	static void span(int[] arr)
	{
		int max=arr[0];;
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min>arr[i])
			{
				min=arr[i];
			}
			
		}
		
		int result=max-min;
		System.out.println(result);
	}

}
