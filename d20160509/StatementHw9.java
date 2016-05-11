package d20160509;

public class StatementHw9 {
	public static void main(String[] args) {
		// 3단 옆으로 출력하기
		// 3 * 1 = 3 3 * 2 = 6.....

		for (int i = 2; i < 10; i++) {
			for (int idx = 0; idx < 9; idx++)// int형 변수 idx가 0이고 idx가 9보다 작을때 까지
												// idx를 1씩 증가
				System.out.print(i+" * " + (idx + 1) + " = " + i * (idx + 1) + " "); // 3단
																					// 구구단을
																					// 옆으로
																					// 출력
			System.out.println();
		}
	}
}
