package d20160519;

public class SmartPhone {
	String	os;
	String	��ȭ��ȣ;
	static String	������;
	String	��Ÿ�;
	String	�ø����ȣ;
	String	����;
	int		���ɹ�ȣ;
	
	public SmartPhone(){
		������ = "����";
	}

	public SmartPhone(String os, String ��ȭ��ȣ, String ������, String ��Ÿ�, String �ø����ȣ, String ����, int ���ɹ�ȣ) {
		super();
		this.os = os;
		this.��ȭ��ȣ = ��ȭ��ȣ;
		this.������ = ������;
		this.��Ÿ� = ��Ÿ�;
		this.�ø����ȣ = �ø����ȣ;
		this.���� = ����;
		this.���ɹ�ȣ = ���ɹ�ȣ;
	}


	public void ��ȭ�ɱ�(String ��ȭ��ȣ) {
		System.out.println("-----------");
		System.out.println(��ȭ��ȣ + "�� �Ŵ��� ....");
	}

	public void ��ȭ�ޱ�() {
		System.out.println("��ȭ�;�");
	}

	public void game() {
		System.out.println("������ �ؿ�");
	}

	public void getApp() {
		System.out.println("���� �ޱ�");
	}
}
