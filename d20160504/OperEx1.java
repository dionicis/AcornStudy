package d20160504;

// 연산자: 자료 가공을 위해 정해진 방식으로 계산하고
//그 결과를 얻기위한 행위를 의미하는 기호들의 총칭
public class OperEx1 {
	public static void main(String[] args) {
		int a = 100;
		int b = 20;

		// a의 변수에 값을 1증가 시키고 싶다.
		a = a + 1;
		System.out.println("a : " + a);

		a++;
		System.out.println("a : " + a);

		// a--;
		// System.out.println("a : " + a);

		// b = a + 1;
		// b = a++; //b에 담고 증가시킴
		b = ++a;
		System.out.println("a : " + a + " " + "b : " + b);
		//////////////////////////////////////////////////
		int k = 20, m = 10; //int형 자료형 k와 m을 선언하고 20과 10을 넣음
		k = m++;
		System.out.println("k : " + k + " " + "m : " + m);

	}
}
