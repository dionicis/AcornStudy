package d20160509;

import java.util.Scanner;

public class StatementEx5 {
	public static void main(String[] args) {
		System.out.println("�� �Է� : "); //�� �Է��� ���
		Scanner scan = new Scanner(System.in); //�ý������κ��� ���� �Է¹޴� Scanner�� ���� scan�� ����
		 int value = scan.nextInt(); //�Է¹��� ������ int�� ���� value�� ����
		 System.out.println(value); //value�� ���
		 if(value>100) //value�� 100���� ū�� �Ǻ��ϴ� ���ǹ�
			 System.out.println("�Է°��� 100���� Ů�ϴ�.");
		 else
			 System.out.println("�Է°��� 100���� �۽��ϴ�.");
	}
}
