package d20160509;

import java.io.IOException;

public class StatementEx4 {
	public static void main(String[] args) throws IOException {
		System.out.println("입력받기 : ");
		int val = System.in.read();// 사용자로부터 1글자를 입력받아 ASCII 코드로 리턴 / 시스템으로부터 숫자를 입력받아 int형 변수 val에 대입
		val -= 48; //val를 48만큼 차감

		for (int i = 0; i < 9; i++) //int형 변수 i를 0으로 초기화하고 i가 9보다 작을때까지 반복하면서 i를 증가시킴
			System.out.println(val + " * " + (i + 1) + " = " + val * (i + 1)); //입력받은 val의 구구단을 출력
		// System.out.println("value : " + val);
	}
}
