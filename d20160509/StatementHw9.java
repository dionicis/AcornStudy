package d20160509;

public class StatementHw9 {
	public static void main(String[] args) {
		// 3�� ������ ����ϱ�
		// 3 * 1 = 3 3 * 2 = 6.....

		for (int i = 2; i < 10; i++) {
			for (int idx = 0; idx < 9; idx++)// int�� ���� idx�� 0�̰� idx�� 9���� ������ ����
												// idx�� 1�� ����
				System.out.print(i+" * " + (idx + 1) + " = " + i * (idx + 1) + " "); // 3��
																					// ��������
																					// ������
																					// ���
			System.out.println();
		}
	}
}
