package d20160510;

public class StatementEx9 {
	public static void main(String[] args) {
		// �л��� ������ ����� ���
		int kor = 55;
		int eng = 90;
		int mat = 70;

		// ������ ����� ���

		// �̶� ����� 60�̻��̸� �հ� �ƴϸ� ���հ� �޼��� ���

		int sum = kor + eng + mat;
		float avg = (float) sum / 3;

		System.out.println("���� : " + sum + ", ��� : " + avg);
		
		if(avg >=60)
			System.out.println("�հ�!");
		else
			System.out.println("���հ�!");

	}
}
