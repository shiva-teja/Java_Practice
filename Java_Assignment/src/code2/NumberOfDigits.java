package code2;

public class NumberOfDigits {

	public static void main(String[] args) {
		int num=12342;
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
