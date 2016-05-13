package d20160512;

public class ArrayEx7 {
	public static void main(String[] args) {
		int[][] m = new int[3][4];

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 4; j++)
				System.out.println(m[i][j]);

		System.out.println(m.length);
		System.out.println(m[0].length);
		System.out.println(m[1][2]);

		int[][] n = new int[2][3];

		System.out.println("n : " + n);
		System.out.println("n[0] : " + n[0]);
		System.out.println("n[0][0] : " + n[0][0]);
		System.out.println("n.length : "+ n.length);
		System.out.println("n[0].length : "+ n[0].length);
	}
}
