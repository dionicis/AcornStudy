package d20160516;

public class Person {
	int		머리, 팔, 다리, 눈, 코, 입;
	int		나이;
	float	키;
	float	몸무게;
	String	이름;
	String	혈액형;
	String	성별;

	Person() {// 없을경우 자동으로 생성
		// 멤버변수의 값을 초기화 할 목적
		// 리턴할 필요가 없는 메서드, void도 안씀
		머리 = 1;
		팔 = 2;
		다리 = 2;
		눈 = 2;
		코 = 1;
		입 = 1;
		나이 = 20;
		키 = 165f;
		몸무게 = 49;
		이름 = "이브";
		혈액형 = "O형";
		성별 = "여자";
		System.out.println("기본생성자 호출됨");
	}

	Person(int x, String y) {
		System.out.println("매개변수있는 생성자");
		나이 = x;
		이름 = y;
	}

	void 먹기() {
		System.out.println("냠냠");
	}

	void 자기() {
		System.out.println("쿨쿨");
	}

	void 생각하기() {
		System.out.println("곰곰");
	}

	void 달린다() {
		System.out.println("씁씁 후후");
	}

	void profile() {
		System.out.println("머리 : " + 머리);
		System.out.println("팔 : " + 팔);
		System.out.println("다리 : " + 다리);
		System.out.println("눈 : " + 눈);
		System.out.println("코 : " + 코);
		System.out.println("입 : " + 입);
		System.out.println("나이 : " + 나이);
		System.out.println("키 : " + 키);
		System.out.println("몸무게 : " + 몸무게);
		System.out.println("이름 : " + 이름);
		System.out.println("혈액형 : " + 혈액형);
		System.out.println("성별 : " + 성별);

	}
}
