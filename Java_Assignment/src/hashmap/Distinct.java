package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Distinct {
// Distinct Elements in Windows of Size K
	public static ArrayList<Integer> Solution(int[] arr, int k){
		ArrayList<Integer> list=new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		
		int i=0;
		while(i<=k-2)
		{
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
			i++;
		}
		i--;
		int j=-1;
		while(i<arr.length-1)
		{
			i++;
			//Acquire
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
			// Work
			
			list.add(map.size());
			// Release
			
			j++;
			int freq=map.get(arr[j]);
			if(freq==1)
			{
				map.remove(arr[j]);
			}
			else {
				map.put(arr[j], freq-1);
			}
			
		}
		
		
		return list;
	}
	
	
	
	
	public static void main(String[] args) {
int[] arr= {2,5,5,6,3,2,3,2,4,5,2,2,2,2,5,6};
int size=4;
System.out.println(Solution(arr, size));
		
	}

}
