package d20160510;
//break : 가장 가까운 반복문을 탈출
//continue : 이번만 생략
//break 라벨명 : 라벨명이 붙은 반복문을 탈출
//continue 라벨명 : 라벨명이 붙은 반복문에서 이번만 생략
public class StatementEx13 {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++)
			for (int idx = 1; idx < 5; idx++) {
				System.out.println("i: " + i + " idx: " + (idx));
				break;
			}

		System.out.println("------------------------------------");
		
		outer: //라벨
		for (int j = 1; j < 5; j++) {
			for (int i = 1; i < 5; i++) {
				System.out.print("*");
				if (i == j)
//					continue outer;//라벨이 있는 바깥쪽 반복문을 제어
					break outer;
			}
			System.out.println();
		}

	}
}
