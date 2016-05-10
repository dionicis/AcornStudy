package d20160510;

import java.util.Scanner;

public class StatementHw10 {
	public static void main(String[] args) {
		//입력된 값이 3의 배수인지 아닌지 판별
		Scanner scan = new Scanner(System.in); //Scanner형 변수 scan을 선언
		int input = scan.nextInt();//입력받은 정수를 int형 변수 input에 대입
		
		if(input%3 == 0) //input을 3으로 나눈 나머지가 0인지를 판별
			System.out.println("3의 배수 입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
	}
}
