package d20160509;

import java.util.Scanner;

public class StatementHw10 {
	public static void main(String[] args) {
		//성적을 입력받아 학점 출력하는 코드 완성해오기
		
		Scanner scan = new Scanner(System.in); //시스템으로부터 값을 입력받는 Scanner형 변수 scan을 선언
		int val = scan.nextInt(); //정수를 int형 변수 val에 대입
		
		if(val >= 90) //val 이 90보다 크거나 같은지를 판별하는 조건식
			System.out.println("A학점 입니다.");
		else if(val >= 80) //val 이 90보다 작고 80보다 큰지를 판별하는 조건식
			System.out.println("B학점 입니다.");
		else if(val >= 70) //val 이 80보다 작고 70보다 큰지를 판별하는 조건식
			System.out.println("C학점 입니다.");
		else if(val >= 60) //val 이 70보다 작고 60보다 큰지를 판별하는 조건식
			System.out.println("D학점 입니다.");
		else //위의 조건을 만족하지 않는 경우 실행
			System.out.println("F학점 입니다.");
	}
}
