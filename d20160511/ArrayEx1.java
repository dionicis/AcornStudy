package d20160511;

public class ArrayEx1 {
	public static void main(String[] args) {
		// �迭 : ����Ʈ ����
		// ������ ����� ���ӵ� ������ �Ҵ�Ǵ� ����
		// int a; ���� ����
		int[] a; // �迭 ����
		// int a[];
		a = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		System.out.println("a[0] : " + a[0]);
		System.out.println("a[1] : " + a[1]);
		System.out.println("a[2] : " + a[2]);

		// ---------------------------------------------------------

		// int ũ�� 10���� �迭 ���� b�� �����ϰ�
		// ������ ������ 10,20,30,40,50,60,70,80,90,100�� ����
		//
		// ����ϼ���

		int[] b = new int[10];
		int x = 10;
		for (int idx = 0; idx < 10; idx++, x += 10)
			b[idx] = x;
		// b[����] : ���� ==>÷��, �ε���
		for (int i = 0; i < 10; i++)
			System.out.println("b[" + i + "] : " + b[i]);
		System.out.println(b[10]);//��Ÿ�� ����
		
	}
}
