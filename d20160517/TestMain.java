package d20160517;

public class TestMain {
	public static void main(String[] args) {
		// Medic medic1 = new Medic();
		// Medic medic2 = new Medic(60,50,"메딕");
		// medic1.상태정보();
		// medic2.상태정보();
		// medic1.힐();

		마린 m1 = new 마린();
		마린 m2 = new 마린();
//		//m1 = m2;
//		//medic = m1; 안댐 클래스가 달라성
//		m2 = m1;
//		m1.hp = 50;
//		System.out.println(m2.hp);
		System.out.println("공격전 m2 상태");
		m2.state();
		
		m1.attack(m2);
//		m2.attack(m1);
		
//		m1.state();
		System.out.println("공격후 m2 상태");
		m2.state();
		
		//마린이 메딕을 공격
		Medic m = new Medic();
		
		//시즈탱크 객체를 생성하고
		//이 탱크가 마린과 시즈탱크를 공격할수 있게 클래스를 작성하세요.
		
		TestGetSet test = new TestGetSet();
		test.setter(1, "피카츄", 25);
		int result = test.getData();
		System.out.println(result);
		
	}
}
