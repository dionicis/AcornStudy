package d20160519;

// 경찰은 총을 가지고 있다. has a
// 경찰은 총이다.X is a
// 다형성
public class Police {
	String	계급, 성별, 이름, 근무지;
	int		나이;
	Weapon	weapon;

	Police() {
		// 일반 경찰
	}

	Police(Weapon w) {
		// 무장 경찰
		this.weapon = w;
	}

	void fire() {
		if (weapon != null)
			weapon.use();
	}

	void 체포() {
		System.out.println("당신은 묵비권을 행사할 수 있으며");
	}

	void 음주단속() {
		System.out.println("잠시 검문이 있겠습니다.");
	}

	void 순찰() {
		System.out.println("왜에에잉");
	}

	void 수사() {
		System.out.println("뭐좀 물을게여");
	}

}
