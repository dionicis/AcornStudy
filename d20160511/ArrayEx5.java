package d20160511;

public class ArrayEx5 {
	public static void main(String[] args) {
		int[][] b = new int[3][2];

		int k = 10;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 2; j++) {
				b[i][j] = k;
				k += 10;
			}
		for (int[] arr : b)
			for (int i : arr)
				System.out.println(i);

		System.out.println("------------------------------------");

		int[][] c = { { 4, 5, 2 }, { 6, 7, 8 }, { 4, 3, 9 }, { 1, 2, 9 } };

		for (int[] arr : c) {
			for (int i : arr)
				System.out.print(i + " ");
			System.out.println();
		}

		System.out.println("---------------------------------------");
		int[][] t = { { 6, 9, 2 }, { 4, 5, 8 } };

		for (int[] arr : t) {
			for (int i : arr)
				System.out.print(i + " ");
			System.out.println();
		}

		int[] a = { 1, 2, 3, };

	}

}
