package d20160510HW;

import java.util.Scanner;

public class Hw3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int money = scan.nextInt();
		
		System.out.println();
		System.out.println("1. �ݶ�       : 1200��");
		System.out.println("2. ���̴�     : 2500��");
		System.out.println("3. ����ź��� : 120��");

		System.out.println();
		System.out.print("�޴��� �Է��ϼ���: ");
		int menu = scan.nextInt();
		System.out.print("� ? ");
		int amount = scan.nextInt();

		switch (menu) {
			case 1:
				System.out.println("�ݶ� " + amount + "��");
				money -= 1200 * amount;
				break;
			case 2:
				System.out.println("���̴� " + amount + "��");
				money -= 2500 * amount;
				break;
			case 3:
				System.out.println("����ź��� " + amount + "��");
				money -= 120 * amount;
				break;
		}
		
		System.out.println();
		System.out.println("�ܵ�\t: " + money);
		System.out.println("����\t: " + money/10000 + "��");
		System.out.println("õ��\t: " + money%10000/1000 + "��");
		System.out.println("�����\t: " + money%10000%1000/500 + "��");
	}
}
