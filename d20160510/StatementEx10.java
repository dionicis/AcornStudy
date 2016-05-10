package d20160510;

import java.util.Scanner;

public class StatementEx10 {
	public static void main(String[] args) {
		// 사용자로부터 성정을 입력받아서 성적을 평가
		System.out.println("성적입력 : ");
		Scanner scan = new Scanner(System.in);

		int score = scan.nextInt();
		if (score >= 90)
			System.out.println("A학점");
		else if (score >= 80)
			System.out.println("B학점");
		else if (score >= 70)
			System.out.println("C학점");
		else if (score >= 60)
			System.out.println("D학점");
		else
			System.out.println("F학점");
	}
}
