package d20160509;

public class StatementHw4 {
	public static void main(String[] args) {
		// int i = 0;
		// for (int idx = 0; idx < 5; idx++) {
		// i += idx+1;
		// System.out.println(i);
		// }

		for (int idx = 0; idx < 5; idx++) { //int�� ���� idx�� 0���� �ʱ�ȭ�ϰ� idx�� 5���� ���������� �ݺ��ϸ鼭 idx�� ������Ŵ
			int num = 0; //int�� ���� num�� 0�� ����
			for (int j = 0; j < idx + 1; j++) //int�� ���� j�� 0���� �ʱ�ȭ�ϰ� j�� idx+1���� ���������� �ݺ��ϸ鼭 j�� ������Ŵ
				num += j+1; //num�� j+1�� ���Ѱ��� num�� ����
			System.out.println(num);//num�� ���
		}
	}
}
