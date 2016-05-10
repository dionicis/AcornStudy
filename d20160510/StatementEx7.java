package d20160510;

import java.util.Scanner;

public class StatementEx7 {
	public static void main(String[] args) {
		//사용자의 입력값을 받아서 이 값이 홀수 인지 짝수인지 판별
//		int input = System.in.read(b, off, len)//한글자, ascii코드값만 받음
		Scanner scan = new Scanner(System.in); //Scanner형 변수 scan을 선언
		int input = scan.nextInt(); //int형 변수 input에 입력받은 정수를 대입
		
		if(input%2 == 0) //input을 2로 나눈 나머지가 0인지를 판별
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		
	}
}
