package d20160511;

public class ArrayEx1 {
	public static void main(String[] args) {
		// 배열 : 아파트 변수
		// 동일한 사이즈에 연속된 공간에 할당되는 변수
		// int a; 변수 선언
		int[] a; // 배열 선언
		// int a[];
		a = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		System.out.println("a[0] : " + a[0]);
		System.out.println("a[1] : " + a[1]);
		System.out.println("a[2] : " + a[2]);

		// ---------------------------------------------------------

		// int 크기 10개으 배열 변수 b를 선언하고
		// 각가의 변수에 10,20,30,40,50,60,70,80,90,100을 대입
		//
		// 출력하세요

		int[] b = new int[10];
		int x = 10;
		for (int idx = 0; idx < 10; idx++, x += 10)
			b[idx] = x;
		// b[숫자] : 숫자 ==>첨자, 인덱스
		for (int i = 0; i < 10; i++)
			System.out.println("b[" + i + "] : " + b[i]);
		System.out.println(b[10]);//런타임 에러
		
	}
}
