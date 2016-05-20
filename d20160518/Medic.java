package d20160518;
// Quiz5 : Medic 객체를 모델링하여 Medic 클래스로 작성하고
// 이 클래스로 객체를 생성한다.
// (단 다양한 매개변수를 갖는 생성자를 포함해야한다)

public class Medic extends Terran{
	int		mp;
	String	gender, name;
	boolean	isHeal;

	Medic() {
		name = "모랄레스";
		atkSpeed = 3;
		gender = "여";
		hp = 80;
		mp = 80;
		moveSpeed = 4;
		range= 2;
		x = 0;
		y = 0;
	}

	Medic(int hp, int mp, String name) {
		// hp : 체력 mp : 마나 name : 이름
		this();// 기본생성자를 불렁
		this.hp = hp;
		this.mp = mp;
		this.name = name;
	}

	Medic(int hp, int mp, String name, int range) {
		// hp : 체력 mp : 마나 name : 이름 사거리 : 사거리;
		this(hp, mp, name);// 기본생성자를 불렁
		this.range = range;
	}

	void 힐(마린 m) {
		if (mp > 10) {
			mp -= 10;
			m.hp += 10;
			System.out.println("치료중입니다.");
		}
		else
			System.out.println("마나가..부족해..");

	}
	void 힐(Ghost g) {
		if (mp > 10) {
			mp -= 10;
			g.hp += 10;
			System.out.println("치료중입니다.");
		}
		else
			System.out.println("마나가..부족해..");
		
	}
}
