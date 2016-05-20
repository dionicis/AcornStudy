package d20160518;

public class 마린 extends Terran {
	// 멤버변수 , 전역변수
	int		atk;
	boolean	isSteamPack;

	public 마린() {
		// super();
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

	마린(int hp) {
		//super();
		this();
		this.hp = hp;
	}

	void attack() {
		System.out.println("attack!");
	}

/*	void attack(마린 enemy) {
		System.out.println("마린을 공격합니다.");
		enemy.hp -= atk;
	}

	void attack(SiegeTank tank) {
		System.out.println("탱크를 공격합니다.");
		tank.hp -= atk;
	}*/
	
	void attack(Terran t){
		System.out.println("마린 매개변수 메서드");
		System.out.println("m : " +t);
		t.hp -= atk;
		System.out.println("상대 체력 : "+t.hp);
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

}
