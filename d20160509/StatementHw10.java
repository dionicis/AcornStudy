package d20160509;

import java.util.Scanner;

public class StatementHw10 {
	public static void main(String[] args) {
		//������ �Է¹޾� ���� ����ϴ� �ڵ� �ϼ��ؿ���
		
		Scanner scan = new Scanner(System.in); //�ý������κ��� ���� �Է¹޴� Scanner�� ���� scan�� ����
		int val = scan.nextInt(); //������ int�� ���� val�� ����
		
		if(val >= 90) //val �� 90���� ũ�ų� �������� �Ǻ��ϴ� ���ǽ�
			System.out.println("A���� �Դϴ�.");
		else if(val >= 80) //val �� 90���� �۰� 80���� ū���� �Ǻ��ϴ� ���ǽ�
			System.out.println("B���� �Դϴ�.");
		else if(val >= 70) //val �� 80���� �۰� 70���� ū���� �Ǻ��ϴ� ���ǽ�
			System.out.println("C���� �Դϴ�.");
		else if(val >= 60) //val �� 70���� �۰� 60���� ū���� �Ǻ��ϴ� ���ǽ�
			System.out.println("D���� �Դϴ�.");
		else //���� ������ �������� �ʴ� ��� ����
			System.out.println("F���� �Դϴ�.");
	}
}
