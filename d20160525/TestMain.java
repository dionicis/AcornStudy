package d20160525;

public class TestMain {
	//�Ϲ�ȭ(���ʸ�)
	public static void main(String[] args) {
		String[] str = { "�츮", "����", "����" };

		// �� �迭�� ��� ������ �ϴ� GenEx1 Ŭ���� ����
		GenEx1<String> ge1 = new GenEx1<String>();// GenEx1Ŭ������ ge1��ü�� �ν��Ͻ�ȭ
		ge1.setArray(str);// str�� �Ű������� �ϴ� ge1�� setArray �޼ҵ� ȣ��
		// ���
		ge1.print();// ge1��ü�� print() �޼ҵ� ȣ��

		System.out.println("-----------------------------------");

		Integer[] m = { 20, 10, 40, 20, 30 };
//		IntArray ia = new IntArray();
		GenEx1<Integer> ia = new GenEx1<Integer>();
		ia.setArray(m);
		ia.print();

		System.out.println("-----------------------------------");

		Float[] f = { 30.2f, 33.3f, 102.34f };
//		FloatArray fa = new FloatArray();
		GenEx1<Float> fa = new GenEx1<Float>();
		fa.setArray(f);
		fa.print();

	}
}
