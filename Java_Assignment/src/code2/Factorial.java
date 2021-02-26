package code2;

public class Factorial {

	public static void main(String[] args) {
		int n=10;
		long fact=1;
		for(int i=2;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		System.out.println(factorial(n));
	}
	public static int factorial(int num)
	{
		if(num<=2)
			return num;
		else
			return num*factorial(num-1);
	}

}
