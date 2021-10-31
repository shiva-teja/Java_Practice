package example;

import java.util.Scanner;

public class Sum_Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int[] a1 = new int[n1];
		for (int i = 0; i < n1; i++) {
			a1[i] = scn.nextInt();
		}
		int n2 = scn.nextInt();
		int[] a2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			a2[i] = scn.nextInt();
		}
		int ans_len = a1.length > a2.length ? a1.length + 1 : a2.length + 1;
//		 int[] ans=new int[ans_len];
		int[] ans = sum_to_array(a1, a2);
		for (int i = 0; i < ans.length; i++) {
			if (i > 0) {
				System.out.println(ans[i]);
			}
			if (i == 0 && ans[i] == 1) {
				System.out.println(ans[i]);
			}
		}

	}

	public static int[] sum_to_array(int[] a1, int[] a2) {

		int ans_len = a1.length > a2.length ? a1.length + 1 : a2.length + 1;
		int[] ans = new int[ans_len];

		int i = a1.length - 1;
		int j = a2.length - 1;
		int k = ans.length - 1;

		int carry = 0;
		while (i >= 0 || j >= 0 || carry > 0) {
			int sum = carry;
			if (i >= 0) {
				sum += a1[i];
			}
			if (j >= 0) {
				sum += a1[j];
			}
			int val = sum % 10;
			carry = sum / 10;

			ans[k] = val;

			i--;
			j--;
			k--;

		}
		return ans;
	}

}
