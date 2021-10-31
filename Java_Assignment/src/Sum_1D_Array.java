package example;

public class Sum_1D_Array {

	public static void main(String[] args) {

		int[] nums = {3,1,2,10,1};
		int[] arr=new int[nums.length];
		int sum=0;
		for(int i=0;i<=nums.length-1;i++)
		{
			sum=sum+nums[i];
			arr[i]=sum;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
