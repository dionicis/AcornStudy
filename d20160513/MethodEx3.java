package d20160513;

public class MethodEx3 {
	// static void �޼����(�Ű�����, �Ű�����, ....){
	// void :�� �޼��带 �������Ŀ� �ƹ��͵� �������� ����, ���ϰ� ����
	// }

/*	static int add(int num1, int num2) {
		System.out.println("========add�޼��� ������=======");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		// ���� ó���ϰ� ���� ���θ޼���� �����Ҽ� �ִ�.
		return num1 + num2;
	}*/
	
	//�Ű������� �̸��� ��������
	static float add(float f1, int a){
		return f1 + a;
	}
	static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static void main(String[] args) {
		// �޼��� ȣ���, �޼����� �Ű����� ����, Ÿ�� ������ ��ġ�ؾ� �Ѵ�.
		float result = add(102.2f, 200);
		// add(100,302.f);
		System.out.println("plus:" + result);
		result = minus(300, 100);
		System.out.println("minus:" + result);
	}
}
