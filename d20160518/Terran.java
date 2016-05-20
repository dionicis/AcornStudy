package d20160518;

public class Terran {// 추상화 하는 방버
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
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + atk);
		System.out.println("공격속도 : " + atkSpeed);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}
