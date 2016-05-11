package d20160509;

import java.util.Scanner;

public class StatementEx5 {
	public static void main(String[] args) {
		System.out.println("값 입력 : "); //값 입력을 출력
		Scanner scan = new Scanner(System.in); //시스템으로부터 값을 입력받는 Scanner형 변수 scan을 선언
		 int value = scan.nextInt(); //입력받은 정수를 int형 변수 value에 대입
		 System.out.println(value); //value를 출력
		 if(value>100) //value가 100보다 큰지 판별하는 조건문
			 System.out.println("입력값이 100보다 큽니다.");
		 else
			 System.out.println("입력값이 100보다 작습니다.");
	}
}
