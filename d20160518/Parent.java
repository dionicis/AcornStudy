package d20160518;

public class Parent {
	int		나이, 자산;
	String	이름, 성별, 성격, 직업;

	Parent() {
		나이 = 56;
		성별 = "여";
		자산 = 1000000000;
		이름 = "엄마";
		성격 = "엘레강스";
		직업 = "프로 주부";
		System.out.println("Parent의 기본생성자");
	}

	Parent(String 이름, String 성격, String 직업, int 자산) {
		this();
		this.이름 = 이름;
		this.성격 = 성격;
		this.직업 = 직업;
		this.자산 = 자산;
	}

	void 먹기() {
		System.out.println("냠냠");
	}

	void 자기() {
		System.out.println("쿨쿨");
	}

	void 잔소리() {
		System.out.println("옛날에는..");
	}

	void 노래부르기() {
		System.out.println("사랑_의 바떼~리가!");
	}

	void 요리하기() {
		System.out.println("뚝딱뚝딱");
	}
}
