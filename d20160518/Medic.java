package d20160518;
// Quiz5 : Medic ��ü�� �𵨸��Ͽ� Medic Ŭ������ �ۼ��ϰ�
// �� Ŭ������ ��ü�� �����Ѵ�.
// (�� �پ��� �Ű������� ���� �����ڸ� �����ؾ��Ѵ�)

public class Medic extends Terran{
	int		mp;
	String	gender, name;
	boolean	isHeal;

	Medic() {
		name = "�������";
		atkSpeed = 3;
		gender = "��";
		hp = 80;
		mp = 80;
		moveSpeed = 4;
		range= 2;
		x = 0;
		y = 0;
	}

	Medic(int hp, int mp, String name) {
		// hp : ü�� mp : ���� name : �̸�
		this();// �⺻�����ڸ� �ҷ�
		this.hp = hp;
		this.mp = mp;
		this.name = name;
	}

	Medic(int hp, int mp, String name, int range) {
		// hp : ü�� mp : ���� name : �̸� ��Ÿ� : ��Ÿ�;
		this(hp, mp, name);// �⺻�����ڸ� �ҷ�
		this.range = range;
	}

	void ��(���� m) {
		if (mp > 10) {
			mp -= 10;
			m.hp += 10;
			System.out.println("ġ�����Դϴ�.");
		}
		else
			System.out.println("������..������..");

	}
	void ��(Ghost g) {
		if (mp > 10) {
			mp -= 10;
			g.hp += 10;
			System.out.println("ġ�����Դϴ�.");
		}
		else
			System.out.println("������..������..");
		
	}
}
