package d20160510;

public class StatementHw16 {
	public static void main(String[] args) {
		// 1���� 100���� ���� 2�� ����� 3�� ����� �ƴ� ���� ��Ƽ� ������ ���� ���
		int sum = 0;
		/*for (int i = 1; i < 101; i++) {
			if (i % 2 == 0 || i % 3 == 0)
				continue;
			sum += i;
		}*/		
		
		for (int i = 1; i < 101; i++)
			if (i % 2 != 0 && i % 3 != 0)
				sum += i;
		System.out.println(sum);
	}
}
