package d20160518;

public class ���� extends Terran {
	// ������� , ��������
	int		atk;
	boolean	isSteamPack;

	public ����() {
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

	����(int hp) {
		//super();
		this();
		this.hp = hp;
	}

	void attack() {
		System.out.println("attack!");
	}

/*	void attack(���� enemy) {
		System.out.println("������ �����մϴ�.");
		enemy.hp -= atk;
	}

	void attack(SiegeTank tank) {
		System.out.println("��ũ�� �����մϴ�.");
		tank.hp -= atk;
	}*/
	
	void attack(Terran t){
		System.out.println("���� �Ű����� �޼���");
		System.out.println("m : " +t);
		t.hp -= atk;
		System.out.println("��� ü�� : "+t.hp);
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
