package d20160509;

import java.io.IOException;

public class StatementEx4 {
	public static void main(String[] args) throws IOException {
		System.out.println("�Է¹ޱ� : ");
		int val = System.in.read();// ����ڷκ��� 1���ڸ� �Է¹޾� ASCII �ڵ�� ���� / �ý������κ��� ���ڸ� �Է¹޾� int�� ���� val�� ����
		val -= 48; //val�� 48��ŭ ����

		for (int i = 0; i < 9; i++) //int�� ���� i�� 0���� �ʱ�ȭ�ϰ� i�� 9���� ���������� �ݺ��ϸ鼭 i�� ������Ŵ
			System.out.println(val + " * " + (i + 1) + " = " + val * (i + 1)); //�Է¹��� val�� �������� ���
		// System.out.println("value : " + val);
	}
}
