package code2;

public class Swap {

	public static void main(String[] args) {
		int a=7;
		int b=8;
		System.out.println(a+" "+b);
		a=(a+b);
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}

}
