package code2;

public class MissingNoarray {

	public static void main(String[] args) {
		int[] arr1={7,5,6,1,3,2};
		int n=arr1.length+1;
		int sum=n*(n+1)/2;
		int result=0;
		for(int i=0;i<=arr1.length-1;i++)
		{
			result+=arr1[i];
		}
		int miss=sum-result;
		System.out.println(miss);
	}

}
