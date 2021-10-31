package example;

public class Prison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 0, 1, 0, 1, 1, 0, 0, 1 };
		int[] arr = prisonAfterNDays(a);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static int[] prisonAfterNDays(int[] cells) {

		int[] day_n = new int[cells.length];
		if (cells[0] == 1) {
			day_n[0] = 0;
		}
		for (int i = 0; i < cells.length; i++) {
			if (i + 1 < cells.length) {
				if (i <= cells.length - 3 && cells[i] == cells[i + 2]) {
					day_n[i + 1] = 0;
				} else {
					day_n[i + 1] = 1;
				}
			}

		}
		if (cells[cells.length - 1] == 1) {
			day_n[cells.length - 1] = 0;
		}
		return day_n;

	}

}
