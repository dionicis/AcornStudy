package d20160510;
//break : ���� ����� �ݺ����� Ż��
//continue : �̹��� ����
//break �󺧸� : �󺧸��� ���� �ݺ����� Ż��
//continue �󺧸� : �󺧸��� ���� �ݺ������� �̹��� ����
public class StatementEx13 {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++)
			for (int idx = 1; idx < 5; idx++) {
				System.out.println("i: " + i + " idx: " + (idx));
				break;
			}

		System.out.println("------------------------------------");
		
		outer: //��
		for (int j = 1; j < 5; j++) {
			for (int i = 1; i < 5; i++) {
				System.out.print("*");
				if (i == j)
//					continue outer;//���� �ִ� �ٱ��� �ݺ����� ����
					break outer;
			}
			System.out.println();
		}

	}
}
