package d20160509;

public class StatementHw5 {
	public static void main(String[] args) {
		int sum = 0; //int형 변수 sum에 0을 대입
		for (int idx = 0; idx < 100; idx++)//int형 변수 idx를 0으로 초기화하고 idx가 100보다 작을때까지 반복하면서 idx를 증가시킴
			sum += (idx + 1); //sum에 sum과 idx+1을 더한값을 대입

		System.out.println("1부터 100까지의 누적합은 " + sum + "입니다.");//1부터 100까지 총합을 출력
	}

}
