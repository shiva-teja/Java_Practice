package example;

import java.util.ArrayList;
import java.util.List;

public class Decompressed_List {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		int[] arr=decompressRLElist(nums);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}
	public static int[] decompressRLElist(int[] nums) {
		int size=0;
        int k=0;
        for(int i=0;i<nums.length;i+=2)
        {
            size+=nums[i];
        }
        int[] arr=new int[size];
        for(int i=0;i<nums.length;i+=2)
        {
            for(int j=0;j<nums[i];j++)
            {
                arr[k++]=nums[i+1];
            }
        }
        return arr;
    }

}
