package example;

public class Reverse_Char_Array {

	public static void main(String[] args) {

		char[] ch= {'T','u','t','o','r','t'};
		int i=0;
		int j=ch.length-1;
		print_arr(ch);
		while(i<=j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
			
			
		}
		System.out.println();
		print_arr(ch);
		
	}
	
	public static void print_arr(char[] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+",");
		}
	}

}
