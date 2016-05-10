package d20160510;

import java.util.Scanner;

public class StatementHw13 {
	public static void main(String[] args) {
		// 화폐교환기
		// 입력 : 67429
		// 5만원 1장 1만원 1장 5천원 1장 천원 2장 오백원 0개 백원 4개 오십원 0개 십원 2개 1원 9개
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0, num9 = 0;
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		if (input >= 50000) {
			num1 = input / 50000;
			input -= num1 * 50000;
		}
		if (input >= 10000) {
			num2 = input / 10000;
			input -= num2 * 10000;
		}
		if (input >= 5000) {
			num3 = input / 5000;
			input -= num3 * 5000;
		}
		if (input >= 1000) {
			num4 = input / 1000;
			input -= num4 * 1000;
		}
		if (input >= 500) {
			num5 = input / 500;
			input -= num5 * 500;
		}
		if (input >= 100) {
			num6 = input / 100;
			input -= num6 * 100;
		}
		if (input >= 50) {
			num7 = input / 50;
			input -= num7 * 50;
		}
		if (input >= 10) {
			num8 = input / 10;
			input -= num8 * 10;
		}
		num9 = input;

		System.out.println("5만원 : " + num1 + " 장");
		System.out.println("1만원 : " + num2 + " 장");
		System.out.println("5천원 : " + num3 + " 장");
		System.out.println("천원 : " + num4 + " 장");
		System.out.println("오백원 : " + num5 + " 개");
		System.out.println("백원 : " + num6 + " 개");
		System.out.println("오십원 : " + num7 + " 개");
		System.out.println("십원 : " + num8 + " 개");
		System.out.println("1원 : " + num9 + " 개");
	}
}
