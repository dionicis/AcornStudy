package d20160510;

import java.util.Scanner;

public class StatementHw10 {
	public static void main(String[] args) {
		//�Էµ� ���� 3�� ������� �ƴ��� �Ǻ�
		Scanner scan = new Scanner(System.in); //Scanner�� ���� scan�� ����
		int input = scan.nextInt();//�Է¹��� ������ int�� ���� input�� ����
		
		if(input%3 == 0) //input�� 3���� ���� �������� 0������ �Ǻ�
			System.out.println("3�� ��� �Դϴ�.");
		else
			System.out.println("3�� ����� �ƴմϴ�.");
	}
}
