package d20160513;

public class MethodEx3 {
	// static void 메서드명(매개변수, 매개변수, ....){
	// void :이 메서드를 실행한후에 아무것도 리턴하지 말것, 리턴값 없음
	// }

/*	static int add(int num1, int num2) {
		System.out.println("========add메서드 실행중=======");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		// 일을 처리하고 값을 메인메서드로 리턴할수 있다.
		return num1 + num2;
	}*/
	
	//매개변수의 이름은 지역변수
	static float add(float f1, int a){
		return f1 + a;
	}
	static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static void main(String[] args) {
		// 메서드 호출시, 메서드명과 매개변수 갯수, 타입 순서가 일치해야 한다.
		float result = add(102.2f, 200);
		// add(100,302.f);
		System.out.println("plus:" + result);
		result = minus(300, 100);
		System.out.println("minus:" + result);
	}
}
