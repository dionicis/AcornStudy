package d20160518.HW;

public class Dragoon extends Protoss {
	boolean	rangeUpgrade;
	int		leg;

	Dragoon() {
		super();
		hp = 250;
		atk = 15;
		atkSpeed = 4;
		moveSpeed = 3;
		def = 2;
		range = 5;
		cost = 150;
		rangeUpgrade = false;
		leg = 4;
	}

	public void rangeUp(boolean speedUp) {
		if (!rangeUpgrade) {
			rangeUpgrade = true;
			range += 3;
			System.out.println("사거리 업!");
		}
	}
}
