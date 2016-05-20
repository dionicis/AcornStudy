package Test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		Star star = new Star(input);
		star.printStar();
		
	}
}
