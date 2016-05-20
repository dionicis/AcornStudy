package d20160517;

public class 마린 {
	// 멤버변수 , 전역변수
	int		hp, x, y, atk, atkSpeed;
	int		moveSpeed, def, range;
	int		cost;
	boolean	isSteamPack;

	public 마린() {
		x = 0;
		y = 0;
		hp = 80;
		atk = 10;
		atkSpeed = 1;
		moveSpeed = 2;
		def = 3;
		range = 5;
		cost = 50;
	}
	
	마린(int hp){
		this();
		this.hp = hp;
	}

	void attack() {
		System.out.println("attack!");
	}
	
	void attack(마린 enemy){
		System.out.println("마린 매개변수가 있는 메서드");
		enemy.hp -= atk;
	}

	void move() {
		System.out.println("Move!");
	}

	void patrol() {
		System.out.println("Wari Gari");
	}

	void steamPack() {
		if (!isSteamPack && hp > 5) {
			isSteamPack = true;
			atk += 3;
			atkSpeed += 3;
			hp -= 5;
			System.out.println("Ah Starcraft");
		}
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
