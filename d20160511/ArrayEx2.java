package d20160511;

public class ArrayEx2 {
	public static void main(String[] args) {
		// �迭 : ������ ũ�⸦ ���� ���ӵ� ������ �Ҵ�� ����
		// 1. ���ټӵ��� ���
		// 2. �ε����� �̿��� �ݺ����� ��� ����
		int[] a;
		a = new int[5];
		// �迭 ������ �������� �ڷ����� �⺻���� �������
		// �⺻���� : 0
		// int �⺻�� : 0
		// float �⺻�� : 0.0f
		// boblean �⺻�� : false;
		System.out.println("a : " + a);
		System.out.println("a[0] : " + a[0]);

		System.out.println("�迭�� ũ�� : " + a.length);
		
		
		a[0] = 1;
		a[1] = 10;
		a[2] = 20;
		a[3] = 50;
		a[4] = 100;
		for (int i = 0; i < 5; i++)
			System.out.println("a[" + i + "] : " + a[i]);
	}
}
