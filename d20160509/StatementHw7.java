package d20160509;

import java.util.Scanner;

public class StatementHw7 {
	public static void main(String[] args) {
		// �Է¹��� �����ܸ� ����ϱ�
		Scanner scan = new Scanner(System.in); //�ý������κ��� ���� �Է¹޴� Scanner�� ���� scan�� ����
		int k = scan.nextInt(); //������ int�� ���� k�� ����
		for (int idx = 0; idx < 9; idx++)//int�� ���� idx�� 0�̰� idx�� 9���� ������ ���� idx�� 1�� ����
			System.out.println(k + " * " + (idx + 1) + " = " + k * (idx + 1)); //�Է¹��� �� k�� ������ ���
	}
}
