package d20160512;

public class ArrayEx6 {
	public static void main(String[] args) {
//		int[] a = new int[3];
		int[] a = {3, 9, 2};
		System.out.println("a + " + a);

		// ������ ũ��
		System.out.println("���� : " + a.length);

		// �迭�� �� ���

		for (int i = 0; i < a.length; i++)
			a[i] = (i+1)*10;
		
		// �迭 ��� ���
		// �ݺ��� ����ؼ� ���
		// for(int i : a)
		// System.out.println(i);

		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
