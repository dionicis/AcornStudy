package d20160510;

import java.util.Scanner;

public class StatementHw12 {
	public static void main(String[] args) {
		// ��ȯ�ϰ��� �ϴ� �ʸ� �Է�: 54321
		// ��� 15�ð� 5�� 21��

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int hour = 0, min = 0, sec = 0;

		if (input / 3600 > 0) {
			hour = input / 3600;
			input -= hour * 3600;
		}
		if (input / 60 > 0) {
			min = input / 60;
			input -= min * 60;
		}

		sec = input;

		System.out.println(hour + "�ð� " + min + "�� " + sec + "��");

	}
}
