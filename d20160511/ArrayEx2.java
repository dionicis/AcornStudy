package d20160511;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 배열 : 동일한 크기를 갖는 연속된 공간에 할당된 변수
		// 1. 접근속도의 향상
		// 2. 인덱스를 이용한 반복문의 사용 가능
		int[] a;
		a = new int[5];
		// 배열 선언이 변수에는 자료형의 기본값이 들어있음
		// 기본값은 : 0
		// int 기본값 : 0
		// float 기본값 : 0.0f
		// boblean 기본값 : false;
		System.out.println("a : " + a);
		System.out.println("a[0] : " + a[0]);

		System.out.println("배열의 크기 : " + a.length);
		
		
		a[0] = 1;
		a[1] = 10;
		a[2] = 20;
		a[3] = 50;
		a[4] = 100;
		for (int i = 0; i < 5; i++)
			System.out.println("a[" + i + "] : " + a[i]);
	}
}
