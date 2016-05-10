package d20160510;

public class StatementHw15 {
	public static void main(String[] args) {
		// 1부터 100까지 수중 2의 배수와 3의 배수가 아닌 값을 출력

//		for (int i = 1; i < 101; i++) {
//			if (i % 2 == 0 || i % 3 == 0)
//				continue;
//			System.out.println(i);
//		}

		for (int i = 1; i < 101; i++)
			if (i % 2 != 0 && i % 3 != 0)
				System.out.println(i);
	}
}
