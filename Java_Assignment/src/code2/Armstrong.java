package code2;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
		int original=n;
		int sum=0;
		while(n!=0)
		{
			int remainder=n%10;
			sum=sum+remainder*remainder*remainder;
			n=n/10;
		}
		if(original==sum)
		{
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Noooooooooooooo");
		}
	}

}
