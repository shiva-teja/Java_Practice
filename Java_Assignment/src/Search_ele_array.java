package example;

import java.util.Scanner;

public class Search_ele_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter input: ");
		int num = scn.nextInt();
		int[] arr = { 10, 24, 34, 98, 87 };
		int pos = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				pos = i;
				
			}

		}
		System.out.println(pos);

	}

}
