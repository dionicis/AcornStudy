package d20160525;

public class ArrayListEx2 {
	// �ڹٴ� ��ü���� ����Դϴ�.
	// int ==> Integer
	// char ==> Character
	// �������� ù�ڰ� �빮��
	// Wrapper Class
	// primitive type�� ������ ���μ� ��ü��

	public static void main(String[] args) {
		Byte bt = new Byte((byte) 20);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		int c = 30;
		Integer it = new Integer(c);
		System.out.println(it.floatValue());
		System.out.println(Integer.toBinaryString(it.intValue()));

		///////////////////////////////////////////////////

		Integer it2 = 40;//AutoBoxing
		int k = it2;//unBoxing
		System.out.println("k " + k);

	}
}
