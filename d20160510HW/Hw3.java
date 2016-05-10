package d20160510HW;

import java.util.Scanner;

public class Hw3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("동전을 입력하세요: ");
		int money = scan.nextInt();
		
		System.out.println();
		System.out.println("1. 콜라       : 1200원");
		System.out.println("2. 사이다     : 2500원");
		System.out.println("3. 구공탄라면 : 120원");

		System.out.println();
		System.out.print("메뉴를 입력하세요: ");
		int menu = scan.nextInt();
		System.out.print("몇개 ? ");
		int amount = scan.nextInt();

		switch (menu) {
			case 1:
				System.out.println("콜라 " + amount + "개");
				money -= 1200 * amount;
				break;
			case 2:
				System.out.println("사이다 " + amount + "개");
				money -= 2500 * amount;
				break;
			case 3:
				System.out.println("구공탄라면 " + amount + "개");
				money -= 120 * amount;
				break;
		}
		
		System.out.println();
		System.out.println("잔돈\t: " + money);
		System.out.println("만원\t: " + money/10000 + "장");
		System.out.println("천원\t: " + money%10000/1000 + "장");
		System.out.println("오백원\t: " + money%10000%1000/500 + "개");
	}
}
