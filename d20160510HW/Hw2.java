package d20160510HW;

import java.util.Scanner;

public class Hw2 {
	public static void main(String[] args) {
		int kor = 0, eng = 0, math = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("��������: ");
		kor = scan.nextInt();
		System.out.print("��������: ");
		eng = scan.nextInt();
		System.out.print("��������: ");
		math = scan.nextInt();
		int total = kor + eng + math;
		float avg = (float) total / 3;

		System.out.println("����: " + total + " ���: " + avg);
	}
}
