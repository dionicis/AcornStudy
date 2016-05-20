package d20160513HW;

public class HW2 {
	public static void main(String[] args) {
		int[] m = { 2, 3, 9 };

		int[] n = { 9, 11, 3 };

		int[] k = new int[3];

		for (int i = 0; i < m.length; i++)
			k[i] = m[i] + n[i];
		
		for(int i:k)
			System.out.print(i+" ");
	}
}
