package d20160504;

public class Hw01 {
	public static void main(String[] args) {
		int m1 = 100; //int형 자료형 m1을 선언하고 100을 넣음
		byte b1 = 20; //b1형 자료형 m1을 선언하고 100을 넣음
		short sh1 = 200; //sh1형 자료형 m1을 선언하고 100을 넣음
		int k = m1 + b1; //b1형 자료형 m1을 선언하고 100을 넣음
		System.out.println("k : " + (m1 + b1));
		
//		byte b2 = k;// int 타입 자료형을  byte 타입에 대입했기 때문
		int b2 = k;
		
//		byte b3 = 300;// byte의 범위를 넘는다
		short b3 = 300;
//		int k = k +1; //초기화를 2번함
		k = k+1;
		System.out.println("k: " + k);
	}
}
