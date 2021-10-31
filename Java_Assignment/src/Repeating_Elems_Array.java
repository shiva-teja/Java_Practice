package example;

import java.util.HashMap;

public class Repeating_Elems_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,3,4,5,2,1,3};
//		int count=0;
//		int final_count=0;
//		for(int i=0;i<arr.length-1;i++)
//		{
//			int j=i+1;
//			count=1;
//			if(arr[i]==arr[j])
//			{
//				count+=1;
//			}
//			if(final_count<count)
//			{
//				final_count=count;
//			}
//		}
		
//		System.out.println(final_count);
		
		
		
		HashMap<Integer,Integer> hm=new HashMap<>();
		
		for(int a:arr)
		{
			hm.put(a, hm.getOrDefault(a, 0)+1);
		}
		System.out.println(hm);

	}

}
