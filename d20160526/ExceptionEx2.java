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
			System.out.println("���� ������ �ƴմϴ�.");
		} catch (ArithmeticException ae) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("��������");
		} finally{
			System.out.println("���ܰ� �߻��ϴ� ���� �ʴ� �ݵ�� ����Ǵ� �ڵ�");
		}
		return m + n;
	}
}
