package d20160518;

public class SuperMan extends Person {
	int	cape;
	int	pants;
	int	leggings;

	SuperMan() {
		// �θ�κ��� �������� ������ �ʱ�ȭ
		// �θ��� �⺻������
		//super(); �ȳ־ �⺻���� �ڹٰ� �����Ŵ
		super(20, "Ŭ��ũ", "�ܰ���", "�Ź�����");
		cape = 1;
		leggings = 1;
		pants = 1;
		System.out.println("Default Constructor of SuperMan");
	}

	public void fly() {
		System.out.println("��");
	}

	public void laserBeam() {
		System.out.println("����");
	}
}
