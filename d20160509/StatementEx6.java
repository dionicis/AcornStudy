package d20160509;

import java.util.Scanner;

public class StatementEx6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//�ý������κ��� �Է¹޴� Scanner�� ���� scan�� ����
		System.out.print("������ �Է��ϼ��� : ");
		int score = scan.nextInt();//������ int�� ���� score�� ����
		System.out.println("�Էµ� ���� : " + score);

		//���� �б⹮
		if (score >= 90) //score�� 90���� ũ�ų� �������� �Ǻ��ϴ� ���ǽ�
			System.out.println("A���� �Դϴ�.");
	}
}
