package d20160510;

import java.util.Scanner;

public class StatementEx7 {
	public static void main(String[] args) {
		//������� �Է°��� �޾Ƽ� �� ���� Ȧ�� ���� ¦������ �Ǻ�
//		int input = System.in.read(b, off, len)//�ѱ���, ascii�ڵ尪�� ����
		Scanner scan = new Scanner(System.in); //Scanner�� ���� scan�� ����
		int input = scan.nextInt(); //int�� ���� input�� �Է¹��� ������ ����
		
		if(input%2 == 0) //input�� 2�� ���� �������� 0������ �Ǻ�
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
		
		
	}
}
