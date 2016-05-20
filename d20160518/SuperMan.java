package d20160518;

public class SuperMan extends Person {
	int	cape;
	int	pants;
	int	leggings;

	SuperMan() {
		// 부모로부터 물려받은 변수고 초기화
		// 부모의 기본생성자
		//super(); 안넣어도 기본으로 자바가 실행시킴
		super(20, "클라크", "외계인", "신문기자");
		cape = 1;
		leggings = 1;
		pants = 1;
		System.out.println("Default Constructor of SuperMan");
	}

	public void fly() {
		System.out.println("슝");
	}

	public void laserBeam() {
		System.out.println("지잉");
	}
}
