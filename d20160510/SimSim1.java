package d20160510;

import java.io.IOException;
import java.util.Scanner;

public class SimSim1 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char[] chArr = str.toCharArray();

		for (char c : chArr) {
			c += 3;
			System.out.print(c);
		}
	}
}
