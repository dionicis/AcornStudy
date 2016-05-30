package d20160526;

public class ExceptionEx3 {
	public static int plus(String a, String b) throws NumberFormatException {
		int m = 0;
		int n = 0;
		m = Integer.parseInt(a);
		n = Integer.parseInt(b);
		return m + n;
	}

	public static void main(String[] args) {
		String a = "100";
		String b = "x";

		try {
			System.out.println(plus(a, b));
		} catch (NumberFormatException nfe) {
			System.out.println("숫자 형식이 아닙니다.");
		}

	}

}
