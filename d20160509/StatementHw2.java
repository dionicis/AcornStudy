package d20160509;

public class StatementHw2 {
	public static void main(String[] args) {
		for(int idx=0; idx<5; idx++){//int�� ���� idx�� 0���� �ʱ�ȭ�ϰ� idx�� 5���� ���������� �ݺ��ϸ鼭 idx�� ������Ŵ
			for(int i =0; i<idx+1; i++)//int�� ���� i�� 0���� �ʱ�ȭ�ϰ� i�� idx+1���� ���������� �ݺ��ϸ鼭 idx�� ������Ŵ
				System.out.print("*"); //*�� ���
			System.out.println();
		}
	}
}
