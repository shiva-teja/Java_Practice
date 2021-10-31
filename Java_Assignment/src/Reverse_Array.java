package example;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int[] a1 = new int[n1];

		for (int i = 0; i < n1; i++) {
			a1[i] = scn.nextInt();
		}
		int i = 0;
		int j = a1.length - 1;
		while (i < j) {
			int temp = a1[i];
			a1[i] = a1[j];
			a1[j] = temp;
			i++;
			j--;
		}
		for (int k = 0; k < n1; k++) {
			System.out.println(a1[k]);
		}
	}

}
