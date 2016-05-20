package d20160517;
// Quiz5 : Medic 객체를 모델링하여 Medic 클래스로 작성하고
// 이 클래스로 객체를 생성한다.
// (단 다양한 매개변수를 갖는 생성자를 포함해야한다)

public class Medic {
	int		공격속도, HP, MP, 이동속도, 사거리, x, y;
	String	성별, 이름;
	boolean	isHeal;

	Medic() {
		이름 = "모랄레스";
		공격속도 = 3;
		성별 = "여";
		HP = 80;
		MP = 80;
		이동속도 = 4;
		사거리 = 2;
		x = 0;
		y = 0;
	}

	Medic(int hp, int mp, String name) {
		// hp : 체력 mp : 마나 name : 이름
		this();// 기본생성자를 불렁
		HP = hp;
		MP = mp;
		이름 = name;
	}

	Medic(int hp, int mp, String name, int 사거리) {
		// hp : 체력 mp : 마나 name : 이름 사거리 : 사거리;
		this(hp, mp, name);// 기본생성자를 불렁
		this.사거리 = 사거리;
	}

	void 힐() {
		if (MP > 10) {
			MP -= 10;
			System.out.println("치료중입니다.");
		}
		else
			System.out.println("마나가..부족해..");

	}

	void 상태정보() {
		System.out.println("===상태정보===");
		System.out.println("이름 = " + 이름);
		System.out.println("HP = " + HP);
		System.out.println("MP = " + MP);
		System.out.println("성별 = " + 성별);
		System.out.println("이동 속도 = " + 이동속도);
		System.out.println("사거리 = " + 사거리);
		System.out.println("==========");
	}

}
