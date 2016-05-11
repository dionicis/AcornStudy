package d20160509;

public class StatementHw3 {
	public static void main(String[] args) {
		String s = new String(); //String형 변수 s를 초기화
		for (int idx = 0; idx < 5; idx++) {//int형 변수 idx를 0으로 초기화하고 idx가 5보다 작을때까지 반복하면서 idx를 증가시킴
			s += idx + 1; //s에 idx+1을 더한값을 대입
			System.out.println(s); //s를 출력
		}
	}
}
