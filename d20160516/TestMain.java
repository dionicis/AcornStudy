package d20160516;

public class TestMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		//클래스명 참조변수 = new 생성자();
		
		//생성자 : 객체의 초기화를 목적으로 멤버 변수의 초기값을 지정해주는
		//특별한 능력이 있는 메서드
		
		//클래스명과 동일한 이름을 가지고 있는 method
		//객체 생성시 1회만 실행되는 method
		Person p2 = new Person();
		Person p3 = new Person();

		p1.나이 = 24;
		p1.성별 = "여자";
		p1.이름 = "송은주";
		p1.혈액형 = "B";
		p1.키 = 179.9f;
		p1.몸무게 = 50.0f;

		p2.나이 = 28;
		p2.성별 = "남자";
		p2.이름 = "최철민";
		p2.혈액형 = "A";
		p2.키 = 179.9f;
		p2.몸무게 = 69.0f;

		System.out.println(p3.이름);
		p1.profile();
		p2.profile();
		p3.profile();
	}
}
