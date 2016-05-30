package d20160524;

import java.util.Random;

public class UtilEx1 {
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			int k = random.nextInt(45);
			System.out.println("k : " + k);
		}
	}
}
