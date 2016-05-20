package d20160516.Hw;

public class Medic {
	// 멤버변수 , 전역변수
	int		hp, x, y, atk, atkSpeed;
	int		moveSpeed, def, range;
	int		cost, mana;
	boolean	manaOring	= false;

	Medic() {
		x = 0;
		y = 0;
		hp = 60;
		mana = 100;
		atk = 0;
		atkSpeed = 0;
		moveSpeed = 2;
		def = 4;
		range = 1;
		cost = 75;
	}

	Medic(int hp, int mana) {
		x = 0;
		y = 0;
		this.hp = hp;
		this.mana = mana;
		atk = 0;
		atkSpeed = 0;
		moveSpeed = 2;
		def = 4;
		range = 1;
		cost = 75;
	}

	void move() {
		System.out.println("Move!");
	}

	void patrol() {
		System.out.println("Wari Gari");
	}

	void hold() {
		System.out.println("Hold!");
	}

	void heal() {
		if (!manaOring && mana > 0) {
			mana -= 5;
			System.out.println("Healing camp!");
		}
	}

	void state() {
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " + mana);
		System.out.println("방어력 : " + def);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}
