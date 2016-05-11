package d20160509;

public class StatementHw8 {
	public static void main(String[] args) {
		// 홀수단만 출력하기
		for (int i = 0; i < 9; i++) //int형 변수 i가 0이고 i가 9보다 작을때 까지 i를 1씩 증가
			if ((i + 1) % 2 == 1) //i+1 이 홀수인지를 판별하는 조건식
				for (int j = 0; j < 9; j++) //int형 변수 j가 0이고 j가 9보다 작을때 까지 i를 1씩 증가
					System.out.println((i+1) + " * " + (j + 1) + " = " + (i+1) * (j + 1)); //i단 구구단을 출력
		}
}
