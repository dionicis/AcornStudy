package d20160519;

// ������ ���� ������ �ִ�. has a
// ������ ���̴�.X is a
// ������
public class Police {
	String	���, ����, �̸�, �ٹ���;
	int		����;
	Weapon	weapon;

	Police() {
		// �Ϲ� ����
	}

	Police(Weapon w) {
		// ���� ����
		this.weapon = w;
	}

	void fire() {
		if (weapon != null)
			weapon.use();
	}

	void ü��() {
		System.out.println("����� ������� ����� �� ������");
	}

	void ���ִܼ�() {
		System.out.println("��� �˹��� �ְڽ��ϴ�.");
	}

	void ����() {
		System.out.println("�ֿ�����");
	}

	void ����() {
		System.out.println("���� �����Կ�");
	}

}
