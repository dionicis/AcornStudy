package d20160517;
// Quiz5 : Medic ��ü�� �𵨸��Ͽ� Medic Ŭ������ �ۼ��ϰ�
// �� Ŭ������ ��ü�� �����Ѵ�.
// (�� �پ��� �Ű������� ���� �����ڸ� �����ؾ��Ѵ�)

public class Medic {
	int		���ݼӵ�, HP, MP, �̵��ӵ�, ��Ÿ�, x, y;
	String	����, �̸�;
	boolean	isHeal;

	Medic() {
		�̸� = "�������";
		���ݼӵ� = 3;
		���� = "��";
		HP = 80;
		MP = 80;
		�̵��ӵ� = 4;
		��Ÿ� = 2;
		x = 0;
		y = 0;
	}

	Medic(int hp, int mp, String name) {
		// hp : ü�� mp : ���� name : �̸�
		this();// �⺻�����ڸ� �ҷ�
		HP = hp;
		MP = mp;
		�̸� = name;
	}

	Medic(int hp, int mp, String name, int ��Ÿ�) {
		// hp : ü�� mp : ���� name : �̸� ��Ÿ� : ��Ÿ�;
		this(hp, mp, name);// �⺻�����ڸ� �ҷ�
		this.��Ÿ� = ��Ÿ�;
	}

	void ��() {
		if (MP > 10) {
			MP -= 10;
			System.out.println("ġ�����Դϴ�.");
		}
		else
			System.out.println("������..������..");

	}

	void ��������() {
		System.out.println("===��������===");
		System.out.println("�̸� = " + �̸�);
		System.out.println("HP = " + HP);
		System.out.println("MP = " + MP);
		System.out.println("���� = " + ����);
		System.out.println("�̵� �ӵ� = " + �̵��ӵ�);
		System.out.println("��Ÿ� = " + ��Ÿ�);
		System.out.println("==========");
	}

}
