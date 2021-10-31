package example;

public class Second_Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,2,4,6,2};
		int first_small=Integer.MAX_VALUE;
		int second_small=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(first_small>arr[i]) {
				second_small=first_small;
				first_small=arr[i];
			}
			if(first_small<arr[i] && second_small >arr[i])
			{
				second_small=arr[i];
			}
		}
		System.out.println(second_small);
		
	}

}
