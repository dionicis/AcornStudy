package d20160516;

public class Person {
	int		�Ӹ�, ��, �ٸ�, ��, ��, ��;
	int		����;
	float	Ű;
	float	������;
	String	�̸�;
	String	������;
	String	����;

	Person() {// ������� �ڵ����� ����
		// ��������� ���� �ʱ�ȭ �� ����
		// ������ �ʿ䰡 ���� �޼���, void�� �Ⱦ�
		�Ӹ� = 1;
		�� = 2;
		�ٸ� = 2;
		�� = 2;
		�� = 1;
		�� = 1;
		���� = 20;
		Ű = 165f;
		������ = 49;
		�̸� = "�̺�";
		������ = "O��";
		���� = "����";
		System.out.println("�⺻������ ȣ���");
	}

	Person(int x, String y) {
		System.out.println("�Ű������ִ� ������");
		���� = x;
		�̸� = y;
	}

	void �Ա�() {
		System.out.println("�ȳ�");
	}

	void �ڱ�() {
		System.out.println("����");
	}

	void �����ϱ�() {
		System.out.println("����");
	}

	void �޸���() {
		System.out.println("���� ����");
	}

	void profile() {
		System.out.println("�Ӹ� : " + �Ӹ�);
		System.out.println("�� : " + ��);
		System.out.println("�ٸ� : " + �ٸ�);
		System.out.println("�� : " + ��);
		System.out.println("�� : " + ��);
		System.out.println("�� : " + ��);
		System.out.println("���� : " + ����);
		System.out.println("Ű : " + Ű);
		System.out.println("������ : " + ������);
		System.out.println("�̸� : " + �̸�);
		System.out.println("������ : " + ������);
		System.out.println("���� : " + ����);

	}
}
