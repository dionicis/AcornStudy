package d20160517;

public class ���� {
	// ������� , ��������
	int		hp, x, y, atk, atkSpeed;
	int		moveSpeed, def, range;
	int		cost;
	boolean	isSteamPack;

	public ����() {
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
	
	����(int hp){
		this();
		this.hp = hp;
	}

	void attack() {
		System.out.println("attack!");
	}
	
	void attack(���� enemy){
		System.out.println("���� �Ű������� �ִ� �޼���");
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
		System.out.println("ü�� : " + hp);
		System.out.println("���ݷ� : " + atk);
		System.out.println("���ݼӵ� : " + atkSpeed);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}
