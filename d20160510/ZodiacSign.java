package d20160510;

import java.util.Scanner;

public class ZodiacSign {
	public static void main(String[] args) {
		// �¾ �⵵�� �Է¹޾� ��������� ����ϴ� �ڵ� �ۼ�

		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		switch (year % 12) {
			case 0:
				System.out.println("�����̶�");
				break;
			case 1:
				System.out.println("�߶�");
				break;
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("���");
				break;
			case 5:
				System.out.println("�Ҷ�");
				break;
			case 6:
				System.out.println("ȣ���̶�");
				break;
			case 7:
				System.out.println("�䳢��");
				break;
			case 8:
				System.out.println("���");
				break;
			case 9:
				System.out.println("���");
				break;
			case 10:
				System.out.println("����");
				break;
			case 11:
				System.out.println("���");
				break;
		}
	}
}
