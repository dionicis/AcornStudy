package d20160519;

public class TestMain4 {
	//public : ���� : ������ ���ٰ�����
	//static : instance ���� ��� ���ٰ�����
	//void : ���ϰ��� ����
	//main : �Լ���
	//(String[] args) : �ްԺ����� args��� String[]�� ���´�.
	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone("�ȵ���̵�", "01022472134", "�Ｚ", "SKT", "d1vd52q4", "������s7", 112437);
		SmartPhone sp2 = new SmartPhone("IOS", "01046873217", "apple", "KT", "b7987zq", "iPhone S6", 713147);
		System.out.println(sp1.������);
		System.out.println(sp2.������);
		System.out.println("------------------");
		System.out.println("�μ��պ�");

		sp1.������ = "�ڷ";
		System.out.println(sp1.������);
		System.out.println(sp2.������);

		System.out.println("------------------");
		System.out.println(SmartPhone.������);
		SmartPhone sp3 = new SmartPhone();
		
		System.out.println(Math.random());
		System.out.println(sp3.������);
	}
}
