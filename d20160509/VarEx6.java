package d20160509;

//6 순위 논리연산자 : &&, ||
public class VarEx6 {
	public static void main(String[] args) {
		boolean b1 = true; //논리형 변수 b1에 true값을 넣음
		boolean b2 = false; //논리형 변수 b2에 false 값을 넣음

		System.out.println("b1 && b2" + (b1 && b2)); //b1과 b2를 논리연산(AND)하여 출력
		System.out.println("b1 || b2" + (b1 || b2)); //b1과 b2를 논리연산(OR)하여 출력
		
		byte b3 =10; //byte형 변수 b3에 10을 넣음
		byte b4 = 20; //byte형 변수 b4에 20을 넣음
//		System.out.println(b3 && b4);안댐
		System.out.println(b3 & b4);
		
		boolean b5 = false;
		System.out.println(!b5); //!는 연산순위 1순이임.
	}

}
