package d20160518;

public class Parent {
	int		����, �ڻ�;
	String	�̸�, ����, ����, ����;

	Parent() {
		���� = 56;
		���� = "��";
		�ڻ� = 1000000000;
		�̸� = "����";
		���� = "��������";
		���� = "���� �ֺ�";
		System.out.println("Parent�� �⺻������");
	}

	Parent(String �̸�, String ����, String ����, int �ڻ�) {
		this();
		this.�̸� = �̸�;
		this.���� = ����;
		this.���� = ����;
		this.�ڻ� = �ڻ�;
	}

	void �Ա�() {
		System.out.println("�ȳ�");
	}

	void �ڱ�() {
		System.out.println("����");
	}

	void �ܼҸ�() {
		System.out.println("��������..");
	}

	void �뷡�θ���() {
		System.out.println("���_�� �ٶ�~����!");
	}

	void �丮�ϱ�() {
		System.out.println("�ҵ��ҵ�");
	}
}
