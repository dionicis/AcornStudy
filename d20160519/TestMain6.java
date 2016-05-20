package d20160519;

import java.util.Arrays;

public class TestMain6 {
	public static void main(String[] args) {
		int[] m = new int[50];

		int[] n = new int[6];
		
		for (int i = 0; i < 50; i++)
			m[i] = i + 1;

		// System.out.println((int) (Math.random() * 100) % 45);
		// System.out.println((int) (Math.random() * 45));

		for (int i = 0; i < 1000; i++) {
			int a = (int) (Math.random() * 45);
			int b = (int) (Math.random() * 45);

			int temp = m[a];
			m[a] = m[b];
			m[b] = temp;
		}

		for (int i = 0; i < 6; i++) {
			n[i] = m[i];
			System.out.print(m[i] + "\t");
		}
		System.out.println();
		// System.out.println("m[" + a + "] : " + m[a] + " m[" + b + "] : " +
		// m[b]);
		
		Arrays.sort(n);
		for(int i: n)
			System.out.print(i+" ");
	}
}
