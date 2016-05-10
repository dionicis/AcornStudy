package d20160510HW;

import java.util.Scanner;

public class Hw2 {
	public static void main(String[] args) {
		int kor = 0, eng = 0, math = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("국어점수: ");
		kor = scan.nextInt();
		System.out.print("영어점수: ");
		eng = scan.nextInt();
		System.out.print("수학점수: ");
		math = scan.nextInt();
		int total = kor + eng + math;
		float avg = (float) total / 3;

		System.out.println("총점: " + total + " 평균: " + avg);
	}
}
