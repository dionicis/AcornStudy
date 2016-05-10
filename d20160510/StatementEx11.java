package d20160510;

import java.io.IOException;
import java.util.Scanner;

public class StatementEx11 {
	public static void main(String[] args) throws IOException {

		System.out.println("당신의 성적을 입력해 주세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		System.out.println("score : " + score);

		switch (score / 10) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
				break;
		}
	}
}
