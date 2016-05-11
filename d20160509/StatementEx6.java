package d20160509;

import java.util.Scanner;

public class StatementEx6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//시스템으로부터 입력받는 Scanner형 변수 scan을 선언
		System.out.print("성적을 입력하세요 : ");
		int score = scan.nextInt();//정수를 int형 변수 score에 대입
		System.out.println("입력된 성적 : " + score);

		//조건 분기문
		if (score >= 90) //score가 90보다 크거나 같은지를 판별하는 조건식
			System.out.println("A학점 입니다.");
	}
}
