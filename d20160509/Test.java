package d20160509;

public class Test {
	// main method : start point of java application
	public static void main(String[] args) {
		// 변수 사용
		// 자료형 변수명 = 상수;
		char ch1 = 'a'; //ch1라는 char형 변수에 문자 'a'를 넣음
		char ch2 = 97; //ch2라는 char형 변수에 ASCII 코드값 97을 넣음
		char ch3 = '\u0061'; //ch3라는 char형 변수에 유니코드값 \u0061을 넣음

		System.out.println("문자열 : " + ch1); //ch1출력
		System.out.println("문자열 : " + ch2); //ch2출력
		System.out.println("문자열 : " + ch3); //ch3출력
		
		//char ch4 = "a"; 안댐
		//char ch5 = 'ab'; 안댐
		
		char ch6 = '\n'; //enter
		char ch7 = '\t'; //tab
		char ch8 = '\b'; //backspace
		char ch9 = '\''; //특수문자 '
		//특수 문자 \n \t \b \' \" \\
		
		
		System.out.println("오늘은"+"월요일"); //오늘은월요일
		System.out.println("오늘은"+ch6+"월요일"); //오늘은 (다음줄)월요일
		System.out.println("오늘은"+ch7+"월요일"); //오늘은 (탭)월요일
		System.out.println("오늘은"+ch8+"월요일"); //오늘은 (백스페이스)
		System.out.println("오늘은"+ch9+"월요일"); //오늘은 '월요일

		
	}// main end
}// class end
