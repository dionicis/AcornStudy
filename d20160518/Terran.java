package d20160518;

public class Terran {// �߻�ȭ �ϴ� ���
	int	hp, x, y, atk, atkSpeed;
	int	moveSpeed, def, range;
	int	cost;

	void move() {
		System.out.println("gogogo");
	}

	void patrol() {
		System.out.println("Wari Gari");
	}

	void hold() {
		System.out.println("Hold!");
	}

	void state() {
		System.out.println("ü�� : " + hp);
		System.out.println("���ݷ� : " + atk);
		System.out.println("���ݼӵ� : " + atkSpeed);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}
