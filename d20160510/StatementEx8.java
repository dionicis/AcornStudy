package d20160510;

import java.io.IOException;

public class StatementEx8 {
	public void result(int input){
		System.out.println(input);//input값을 출력
		if(input >= 48 && input <= 57) //input 이 0~9사이 인지를 판별
			System.out.println("숫자 입니다.");
		else if(input >= 65 && input <= 90)//input이 A~Z사이 인지를 판별
			System.out.println("대문자 입니다.");
		else if(input >= 97 && input <= 122) //input이 a~z사이 인지를 판별
			System.out.println("소문자 입니다.");
		else //3개의 범위에 들지 않으면
			System.out.println("숫자도, 대문자도, 소문자도 아닙니다.");
	}
	public static void main(String[] args) throws IOException{
		//입력된 값이 대문자 소문자 숫자인지 판별
		int input = System.in.read(); //시스템으로부터 한글자를 입력받아 int형 변수 input 에 담는다.
		
		StatementEx8 st8 = new StatementEx8();
		st8.result(input);

	}
}
