package d20160526;

public class ExceptionEx2 {
	public static void main(String[] args) {
		String a = "100";
		String b = "x";

		System.out.println(plus(a, b));

	}

	public static int plus(String a, String b) {
		int m = 0;
		int n = 0;
		try {
			m = Integer.parseInt(a);
			n = Integer.parseInt(b);
		} catch (NumberFormatException nfe) {
			System.out.println("숫자 형식이 아닙니다.");
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("나도몰랑");
		} finally{
			System.out.println("예외가 발생하던 하지 않던 반드시 실행되는 코드");
		}
		return m + n;
	}
}
