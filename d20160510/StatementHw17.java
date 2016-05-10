package d20160510;

public class StatementHw17 {
	public static void main(String[] args) {
		// 주사위 2개를 던져 합이 4가 되는 모든 경우에 수를 출력하세요.
		for (int i = 1; i < 7; i++)
			for (int j = 1; j < 7; j++)
				if (i + j == 4)
					System.out.println("주사위1 : " + i + " 주사위2 : " + j);
	}
}
