package d20160517.HW;

public class HW1 {
	public static void main(String[] args) {
		int[][] arr1 = { { 3, 2, 3 }, { 4, 5, 6 }, { 1, 4, 9 } };
		int[][] arr2 = { { 1, 8, 7 }, { 6, 4, 4 }, { 3, 2, 3 } };
		int[][] arr3 = new int[arr1.length][arr1[0].length];

		for (int i = 0; i < arr3.length; i++)
			for (int j = 0; j < arr3[i].length; j++)
				arr3[i][j] = arr1[i][j] + arr2[i][j];

		for (int[] arr : arr3) {
			for (int i : arr)
				System.out.print(i + " ");
			System.out.println();
		}
	}
}
