package d20160513;

public class MethodEx7 {
	static int getMax(int[] m) {
		int max = 0;
		for (int i = 0; i < m.length; i++)
			if (max < m[i])
				max = m[i];
		return max;
	}

	public static void main(String[] args) {
		int[] m = { 200, 900, 2000, 140, 299, 500 };
		System.out.println(getMax(m));
	}
}
