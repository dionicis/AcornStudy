package d20160517.HW;

import java.util.Scanner;

public class HW5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] intArr = new int[10];
		for (int i = 0; i < 10; i++)
			intArr[i] = scan.nextInt();

		int max = 0;
		int idx = 0;
		for (int i = 0; i < intArr.length; i++)
			if (max < intArr[i]) {
				max = intArr[i];
				idx = i;
			}
		System.out.println((idx + 1) + "¹øÂ°");
	}
}
