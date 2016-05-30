package d20160526;

import java.util.Random;

public class ExceptionEx1 {
	public static void main(String[] args) {
		// 1. Error : 치명적 오류
		// 2. Exception : 가벼운 오류
		// 1번 try ~~ catch : case by case 정의
		// 2번 예외 전가
		int a = 100;
		Random rd = new Random();
		try {// 예외가 발생하면 예외상황을 대신 처리하고 끝나버림
			for (int i = 0; i < 100; i++) {
				int b = rd.nextInt(10);
				System.out.println("a/b : " + a / b);
				System.out.println("ha.ha.");
			}
		} catch (ArithmeticException ae) {
			System.out.println("0으로는 나눌 수 없어요");
		} catch (Exception e) {
			System.out.println("나도 몰라 예외");
			e.getStackTrace();// 지금까지 stack 메모리를 추적
		}
	}
}
