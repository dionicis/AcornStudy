package d20160516;

public class Monkey {
	int 꼬리;
	int 귀;
	int 눈;
	int 코;
	int 입;
	int 나이;
	String 종류;
	String 성별;
	
	Monkey(){
		성별 = "숫컷";
		나이 = 10;
	}
	
	Monkey(int age, String gender, String species){
		나이 = age;
		성별 = gender;
		종류 = species;
	}
	
	void 나무타기(){
		System.out.println("나무를 탑니다.");
	}
	
	void 먹기(){
		System.out.println("바나나를 먹는다.");
	}
	
	void 걷기(){
		System.out.println("걷습니다.");
	}
	
	void 자기(){
		System.out.println("Zzzzz...");
	}
}
