package d20160509;

public class StatementHw3 {
	public static void main(String[] args) {
		String s = new String(); //String�� ���� s�� �ʱ�ȭ
		for (int idx = 0; idx < 5; idx++) {//int�� ���� idx�� 0���� �ʱ�ȭ�ϰ� idx�� 5���� ���������� �ݺ��ϸ鼭 idx�� ������Ŵ
			s += idx + 1; //s�� idx+1�� ���Ѱ��� ����
			System.out.println(s); //s�� ���
		}
	}
}
