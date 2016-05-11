package d20160504;

public class VarEx2 {
		//자바의 모든 변수는 반드시 초기화 해서 사용해야 합니다.
	public static void main(String[] args) {
		//변수를 선언하면서 값을 지정 : 초기화
		byte b1 = 10; //b1이라는 이름의  byte크기 변수 선언하고 10을 넣음
		byte b2 = 20; //b2이라는 이름의  byte크기 변수 선언하고 10을 넣음
		
		System.out.println(b1+b2); //b1과 b2를 더한값을 출력
		
		short sh1 = 150;
		
		//sh1 = b1; // 암시적 형변환
		sh1 = b1;//sh1에 b1이 담고있는 값을 대입
		
		b1 = (byte) sh1; // 명시적 형변환
		System.out.println(b1);
	}
}
