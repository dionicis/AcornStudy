package d20160510;

import java.io.IOException;

public class StatementEx8 {
	public void result(int input){
		System.out.println(input);//input���� ���
		if(input >= 48 && input <= 57) //input �� 0~9���� ������ �Ǻ�
			System.out.println("���� �Դϴ�.");
		else if(input >= 65 && input <= 90)//input�� A~Z���� ������ �Ǻ�
			System.out.println("�빮�� �Դϴ�.");
		else if(input >= 97 && input <= 122) //input�� a~z���� ������ �Ǻ�
			System.out.println("�ҹ��� �Դϴ�.");
		else //3���� ������ ���� ������
			System.out.println("���ڵ�, �빮�ڵ�, �ҹ��ڵ� �ƴմϴ�.");
	}
	public static void main(String[] args) throws IOException{
		//�Էµ� ���� �빮�� �ҹ��� �������� �Ǻ�
		int input = System.in.read(); //�ý������κ��� �ѱ��ڸ� �Է¹޾� int�� ���� input �� ��´�.
		
		StatementEx8 st8 = new StatementEx8();
		st8.result(input);

	}
}
