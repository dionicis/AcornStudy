package d20160509;

//6 ���� �������� : &&, ||
public class VarEx6 {
	public static void main(String[] args) {
		boolean b1 = true; //���� ���� b1�� true���� ����
		boolean b2 = false; //���� ���� b2�� false ���� ����

		System.out.println("b1 && b2" + (b1 && b2)); //b1�� b2�� ������(AND)�Ͽ� ���
		System.out.println("b1 || b2" + (b1 || b2)); //b1�� b2�� ������(OR)�Ͽ� ���
		
		byte b3 =10; //byte�� ���� b3�� 10�� ����
		byte b4 = 20; //byte�� ���� b4�� 20�� ����
//		System.out.println(b3 && b4);�ȴ�
		System.out.println(b3 & b4);
		
		boolean b5 = false;
		System.out.println(!b5); //!�� ������� 1������.
	}

}
