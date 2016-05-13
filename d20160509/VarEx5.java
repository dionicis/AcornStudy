package d20160509;

//boolean : true = 1, false = 0;
//단축키 : 복사 : ctrl + c ; 붙여넣기 : ctrl + v
//			잘라내기 : ctrl + x ; 저장 : ctrl + s
//문단이동 : alt + 화살표 방향 위아래

//5순위 연산자 : 비트 연산자
//and ==> &, or ==> |
public class VarEx5 {
	public static void main(String[] args) {
		byte a = 10; // 0000 1010;
		byte b = 22; // 0001 0110;
		
		int c = a&b; // 0000 0010;
		int d = a|b; // 0001 1110;
		System.out.println(c); //int형 c를 출력
		System.out.println(d); //int형 d를 출력
		
		boolean b1 = true; //논리형 변수 b1에 true값을 넣음
		boolean b2 = false; //논리형 변수 b2에 false 값을 넣음
		
		System.out.println("b1 & b2 : " + (b1 & b2)); //b1과 b2를 비트연산하여 출력
		
	}
}
