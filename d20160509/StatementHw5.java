package d20160509;

public class StatementHw5 {
	public static void main(String[] args) {
		int sum = 0; //int�� ���� sum�� 0�� ����
		for (int idx = 0; idx < 100; idx++)//int�� ���� idx�� 0���� �ʱ�ȭ�ϰ� idx�� 100���� ���������� �ݺ��ϸ鼭 idx�� ������Ŵ
			sum += (idx + 1); //sum�� sum�� idx+1�� ���Ѱ��� ����

		System.out.println("1���� 100������ �������� " + sum + "�Դϴ�.");//1���� 100���� ������ ���
	}

}
