package d20160518.HW;

public class Zealot extends Protoss {
	int		blade;
	boolean	isSpeedUp;

	Zealot() {
		hp = 200;
		atk = 10;
		atkSpeed = 3;
		moveSpeed = 4;
		def = 2;
		range = 1;
		cost = 100;
		blade = 2;
		isSpeedUp = false;
	}
	
	public void speedUp(boolean speedUp) {
		if (!isSpeedUp) {
			isSpeedUp = true;
			moveSpeed += 4;
			System.out.println("¹ß¾÷!");
		}
	}

}
