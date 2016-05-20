package d20160519;

public class TestMain4 {
	//public : 공용 : 누구나 접근가능한
	//static : instance 생성 없어도 접근가능한
	//void : 리턴값이 없는
	//main : 함수명
	//(String[] args) : 메게변수로 args라는 String[]를 갖는다.
	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone("안드로이드", "01022472134", "삼성", "SKT", "d1vd52q4", "갤럭시s7", 112437);
		SmartPhone sp2 = new SmartPhone("IOS", "01046873217", "apple", "KT", "b7987zq", "iPhone S6", 713147);
		System.out.println(sp1.제조사);
		System.out.println(sp2.제조사);
		System.out.println("------------------");
		System.out.println("인수합병");

		sp1.제조사 = "小米";
		System.out.println(sp1.제조사);
		System.out.println(sp2.제조사);

		System.out.println("------------------");
		System.out.println(SmartPhone.제조사);
		SmartPhone sp3 = new SmartPhone();
		
		System.out.println(Math.random());
		System.out.println(sp3.제조사);
	}
}
