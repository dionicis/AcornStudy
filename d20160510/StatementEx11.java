package d20160510;

import java.io.IOException;
import java.util.Scanner;

public class StatementEx11 {
	public static void main(String[] args) throws IOException {

		System.out.println("����� ������ �Է��� �ּ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		System.out.println("score : " + score);

		switch (score / 10) {
			case 10:
			case 9:
				System.out.println("A����");
				break;
			case 8:
				System.out.println("B����");
				break;
			case 7:
				System.out.println("C����");
				break;
			case 6:
				System.out.println("D����");
				break;
			default:
				System.out.println("F����");
				break;
		}
	}
}
