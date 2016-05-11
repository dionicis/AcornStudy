package d20160509;

public class StatementEx2 {
	// 반복문 for 문
	public static void main(String[] args) {

		int i = 1; //초기식 int형 변수 i에 1일 대입
		while (i < 10) { //조건식 i가 10 보다 작을때 까지 반복
			System.out.println("3 * " + i +" = " + 3*i); //구구단 3단 출력
			i++;//증감식 i를 1만큼 증가
		}
	}
}
