package d20160510;

public class StatementHw17 {
	public static void main(String[] args) {
		// �ֻ��� 2���� ���� ���� 4�� �Ǵ� ��� ��쿡 ���� ����ϼ���.
		for (int i = 1; i < 7; i++)
			for (int j = 1; j < 7; j++)
				if (i + j == 4)
					System.out.println("�ֻ���1 : " + i + " �ֻ���2 : " + j);
	}
}
