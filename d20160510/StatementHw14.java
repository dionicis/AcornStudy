package d20160510;

public class StatementHw14 {
	public static void main(String[] args) {
		for (int idx = 0; idx < 5; idx++) {
			for (int i = 0; i < 5 - idx; i++)
				System.out.print("*");
			System.out.println();
		}
	}
}
