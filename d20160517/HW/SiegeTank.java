package d20160517.HW;

public class SiegeTank {
	int		hp, x, y, atk, atkSpeed;
	int		moveSpeed, def, range;
	int		cost;
	boolean	siegeMod;

	SiegeTank() {
		hp = 150;
		x = 0;
		y = 0;
		atk = 30;
		atkSpeed = 1;
		moveSpeed = 2;
		def = 1;
		range = 3;
		cost = 150;
	}

	void siegeMod() {
		if (!siegeMod) {
			atk = 70;
			range = 5;
		}
		else {
			atk = 30;
			range = 3;
		}
	}

	void attack(���� marin) {
		marin.hp -= atk;
	}

	void attack(SiegeTank tank) {
		tank.hp -= atk;
	}
}
