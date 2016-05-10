package d20160510;

public class StatementHw16 {
	public static void main(String[] args) {
		// 1부터 100까지 수중 2의 배수와 3의 배수가 아닌 값을 모아서 누적한 값을 출력
		int sum = 0;
		/*for (int i = 1; i < 101; i++) {
			if (i % 2 == 0 || i % 3 == 0)
				continue;
			sum += i;
		}*/		
		
		for (int i = 1; i < 101; i++)
			if (i % 2 != 0 && i % 3 != 0)
				sum += i;
		System.out.println(sum);
	}
}
