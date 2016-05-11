package d20160509;

public class StatementEx3 {

	public static void main(String[] args) {
		int i = 1; //초기식 int형 변수 i에 1일 대입
		do { //반복문 1회 실행
			System.out.println(" 3 * " + i + " = " + 3 * i);//구구단 3단 출력
			i++;//i를 1만큼 증가
		} while (i < 10);//조건식 i가 10보다 작을때까지 실행

	}
}
