package d20160504;

// ������: �ڷ� ������ ���� ������ ������� ����ϰ�
//�� ����� ������� ������ �ǹ��ϴ� ��ȣ���� ��Ī
public class OperEx1 {
	public static void main(String[] args) {
		int a = 100;
		int b = 20;

		// a�� ������ ���� 1���� ��Ű�� �ʹ�.
		a = a + 1;
		System.out.println("a : " + a);

		a++;
		System.out.println("a : " + a);

		// a--;
		// System.out.println("a : " + a);

		// b = a + 1;
		// b = a++; //b�� ��� ������Ŵ
		b = ++a;
		System.out.println("a : " + a + " " + "b : " + b);
		//////////////////////////////////////////////////
		int k = 20, m = 10; //int�� �ڷ��� k�� m�� �����ϰ� 20�� 10�� ����
		k = m++;
		System.out.println("k : " + k + " " + "m : " + m);

	}
}
