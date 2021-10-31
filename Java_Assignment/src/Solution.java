package example;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		int[] candies={2,8,7};
		int extraCandies=1;
		List<Boolean> arr=new ArrayList<>();
		arr=kidsWithCandies(candies, extraCandies);
		for(boolean bl:arr)
		{
			System.out.println(bl);
		}
		
		
	}
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> arr=new ArrayList<>();
        int max=candies[0];
        for(int i=1;i<candies.length;i++)
        {
            if(candies[i]>max)
            {
            	max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            int new_max=candies[i]+extraCandies;
            if(max<=new_max)
            {
                arr.add(i,true);
            }
            else{
                arr.add(i,false);
            }
        }
        return arr;
        
    }
}