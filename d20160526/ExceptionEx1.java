package d20160526;

import java.util.Random;

public class ExceptionEx1 {
	public static void main(String[] args) {
		// 1. Error : ġ���� ����
		// 2. Exception : ������ ����
		// 1�� try ~~ catch : case by case ����
		// 2�� ���� ����
		int a = 100;
		Random rd = new Random();
		try {// ���ܰ� �߻��ϸ� ���ܻ�Ȳ�� ��� ó���ϰ� ��������
			for (int i = 0; i < 100; i++) {
				int b = rd.nextInt(10);
				System.out.println("a/b : " + a / b);
				System.out.println("ha.ha.");
			}
		} catch (ArithmeticException ae) {
			System.out.println("0���δ� ���� �� �����");
		} catch (Exception e) {
			System.out.println("���� ���� ����");
			e.getStackTrace();// ���ݱ��� stack �޸𸮸� ����
		}
	}
}
