package d20160510;

import java.util.Scanner;

public class StatementHw13 {
	public static void main(String[] args) {
		// ȭ��ȯ��
		// �Է� : 67429
		// 5���� 1�� 1���� 1�� 5õ�� 1�� õ�� 2�� ����� 0�� ��� 4�� ���ʿ� 0�� �ʿ� 2�� 1�� 9��
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

		System.out.println("5���� : " + num1 + " ��");
		System.out.println("1���� : " + num2 + " ��");
		System.out.println("5õ�� : " + num3 + " ��");
		System.out.println("õ�� : " + num4 + " ��");
		System.out.println("����� : " + num5 + " ��");
		System.out.println("��� : " + num6 + " ��");
		System.out.println("���ʿ� : " + num7 + " ��");
		System.out.println("�ʿ� : " + num8 + " ��");
		System.out.println("1�� : " + num9 + " ��");
	}
}
