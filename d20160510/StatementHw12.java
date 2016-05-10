package d20160510;

import java.util.Scanner;

public class StatementHw12 {
	public static void main(String[] args) {
		// 변환하고자 하는 초를 입력: 54321
		// 출력 15시간 5분 21초

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int hour = 0, min = 0, sec = 0;

		if (input / 3600 > 0) {
			hour = input / 3600;
			input -= hour * 3600;
		}
		if (input / 60 > 0) {
			min = input / 60;
			input -= min * 60;
		}

		sec = input;

		System.out.println(hour + "시간 " + min + "분 " + sec + "초");

	}
}
