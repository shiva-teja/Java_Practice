package code2;

import java.util.Scanner;

public class Maxconsecone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
       int[] arr1=new int[n];
       for(int i=0;i<n;i++) {
    	   arr1[i]=sc.nextInt();
       }
//       	int ans=countones(arr1);
//       	System.out.println(ans);
       int ans1=consecutiveones(arr1);
       System.out.println(ans1);
	}
	
//	public static int countones(int[] arr1) {
//		int cnt=0;
//		for(int i=0;i<arr1.length;i++) {
//			if(arr1[i]!=1) {
//				continue;
//			}else if(arr1[i]==1)
//			{
//				cnt++;
//			}
//		}
//		return cnt;
//		
//	}
    public static int consecutiveones(int[] arr1) {
    	
    		    int count = 0;  
    		    int result = 0; 
    		  
    		    for (int i = 0; i < arr1.length; i++) 
    		    { 
    		        
    		        if (arr1[i]==1) {
    		            
    		        	count++;}
    		        		
    		        else {
    		        	count=0;}
    		        	result= Math.max(result,count);
    		        }
		return count;
    	
    }


//private static int max(int result, int count) {
//	int max=0;
//	if(result>count) {
//		return result;
//	}else
//	{
//		return count;
//	}
//	
//}
}