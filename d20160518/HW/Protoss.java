package d20160518.HW;

public class Protoss {
	protected int		hp, x, y, atk, atkSpeed;
	protected int		moveSpeed, def, range;
	protected int		cost;
	protected boolean	visible;

	Protoss() {
		x = 0;
		y = 0;
		visible = true;
	}

	void move() {
		System.out.println("For Adune!");
	}

	void patrol() {
		System.out.println("Wari Gari");
	}

	void hold() {
		System.out.println("Seramak");
	}

	void state() {
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + atk);
		System.out.println("공격속도 : " + atkSpeed);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}
