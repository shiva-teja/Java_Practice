package example;

public class Array_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,2,1,5,3,4};
		int[] arr=new int[nums.length];
		
		for(int i=0;i<nums.length;i++)
		{
			int j=nums[i];
			arr[i]=nums[j];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
