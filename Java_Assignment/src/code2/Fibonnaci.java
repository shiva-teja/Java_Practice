package code2;

public class Fibonnaci {

	public static void main(String[] args) {
		int n=10;
		int prev=0;
		int next=1;
		int sum=0;
		System.out.print(prev+" "+next);
		for(int i=2;i<n;i++)
		{
			sum=prev+next;
			System.out.print(" "+sum);
			prev=next;
			next=sum;
		}
	}

}
