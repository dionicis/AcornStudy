package d20160509;

import java.util.Scanner;

public class StatementHw7 {
	public static void main(String[] args) {
		// 입력받은 구구단만 출력하기
		Scanner scan = new Scanner(System.in); //시스템으로부터 값을 입력받는 Scanner형 변수 scan을 선언
		int k = scan.nextInt(); //정수를 int형 변수 k에 대입
		for (int idx = 0; idx < 9; idx++)//int형 변수 idx가 0이고 idx가 9보다 작을때 까지 idx를 1씩 증가
			System.out.println(k + " * " + (idx + 1) + " = " + k * (idx + 1)); //입력받은 값 k의 구구단 출력
	}
}
