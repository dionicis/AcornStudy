package d20160510;

public class StatementHw15 {
	public static void main(String[] args) {
		// 1���� 100���� ���� 2�� ����� 3�� ����� �ƴ� ���� ���

//		for (int i = 1; i < 101; i++) {
//			if (i % 2 == 0 || i % 3 == 0)
//				continue;
//			System.out.println(i);
//		}

		for (int i = 1; i < 101; i++)
			if (i % 2 != 0 && i % 3 != 0)
				System.out.println(i);
	}
}
