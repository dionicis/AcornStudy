package d20160509;

public class StatementEx1 {
	public static void main(String[] args) {
		int su = 1; //int�� ���� su�� 1�� ����
		for (int i = 1; i <= 9; i++) { //int�� ���� i�� �����ϰ� i�� 9���� ������ ����, i�� 1��ŭ ����
			// System.out.println("3 * 1 = 3 ");
			// System.out.println("3 * " + su + "= 3 ");

//			System.out.println("3 * " + su + " = " + 3 * su); //3�� ������ ���
			System.out.println("su : " + su + " i :  " + i); //su�� i�� ���
			su++;
		}
	}
}
