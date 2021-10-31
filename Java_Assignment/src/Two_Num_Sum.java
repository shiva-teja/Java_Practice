package example;

import java.util.Arrays;

public class Two_Num_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,4,1,19,10};
		int target=6;
		Arrays.sort(nums);
		int i=0;
		int j=nums.length-1;
		while(i<j)
		{
			if(nums[i]+nums[j]==target)
			{
				System.out.println(nums[i]+" and "+nums[j]+" can form "+target);
				return;
			}
			else if(nums[i]+nums[j]<target)
			{
				i++;
			}
			else {
				j--;
			}
		}

	}

}
