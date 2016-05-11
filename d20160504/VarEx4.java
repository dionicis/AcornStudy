package d20160504;

public class VarEx4 {
	public static void main(String[] args) {
		// 자료형 변수형 = 상수;
		// 모든 문장은 ;이 라인 종결자
		int i = 20; //i이라는 이름의  int형크기 변수 선언하고 20 넣음
		System.out.println("i : " + i);
		
		char c = 'a'; //c이라는 이름의  char형크기 변수 선언하고 a라는 문자를 넣음
		System.out.println("c : " + c);
		
		char d1 = 'J'; //d1이라는 이름의  char형크기 변수 선언하고 J라는 문자를 넣음
		char d2 = 'A'; //d2이라는 이름의  char형크기 변수 선언하고 A라는 문자를 넣음
		char d3 = 'V'; //d3이라는 이름의  char형크기 변수 선언하고 V라는 문자를 넣음
		char d4 = 'A'; //d4이라는 이름의  char형크기 변수 선언하고 A라는 문자를 넣음
		System.out.println(""+d1+d2+d3+d4);
		
		String str = "Hello Java World";
		System.out.println(str);
		////////////////////////////////////
		
		char c1 = 'A';
//		char c2 = 'AB';
		String s1 = "A";
		String s2 = "AB";
		
		char ch1 = 'a'; //문자
		char ch2 = 97; // ASCII 코드
		char ch3 = '\u0061'; // unicode
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		System.out.println("ch3 : "+ch3);
		//문자열 + 숫자 -> 문자
		//문자 + 문자 -> 산술연산자
		System.out.println(d1+d2);//산술연산자
		System.out.println(""+d1+d2);//연결 연산자
		//문자의 ASCII 코드 + ASCII 코드
	}
}
