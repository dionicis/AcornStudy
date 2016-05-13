package d20160512;

import java.util.Scanner;

public class MethodEx1 {

	static void prtStar(int input) {
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if (j < input - i - 1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	static void prtHello() {
		System.out.println("안녕 자바");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("별 출력: ");
		int input = scan.nextInt();
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}// for end

		prtStar(input);
		prtHello();
	}
}
