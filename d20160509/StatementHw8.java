package d20160509;

public class StatementHw8 {
	public static void main(String[] args) {
		// Ȧ���ܸ� ����ϱ�
		for (int i = 0; i < 9; i++) //int�� ���� i�� 0�̰� i�� 9���� ������ ���� i�� 1�� ����
			if ((i + 1) % 2 == 1) //i+1 �� Ȧ�������� �Ǻ��ϴ� ���ǽ�
				for (int j = 0; j < 9; j++) //int�� ���� j�� 0�̰� j�� 9���� ������ ���� i�� 1�� ����
					System.out.println((i+1) + " * " + (j + 1) + " = " + (i+1) * (j + 1)); //i�� �������� ���
		}
}
