package d20160511;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] c;
		c = new int[6];

		for (int i = 0; i < c.length; i++) {
			c[i] = (i + 1) * 11;
			System.out.println(c[i]);
		}

		System.out.println("--------------------------------");

		/*
		 * int[] m = new int[4]; m[0] = 20; m[1] = 10; m[2] = 90; m[3] = 110;
		 */

		int[] m = { 20, 10, 90, 110 };
		
		for(int i : m)
			System.out.println(i);
	}
}
