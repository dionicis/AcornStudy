package d20160513;

public class MethodEx2 {

	static void printGuGuDan(int dan) {// �Ű����� parameter ���� �μ� argument
		// ������3�����
		System.out.println("���޹��� ����: " + dan);
		for (int i = 1; i < 10; i++)
			System.out.println(dan + " * " + i + " = " + dan * i);
	}

	// static void printGuGuDan5() {
	// // ������3�����
	// for (int i = 1; i < 10; i++)
	// System.out.println("5 * " + i + " = " + 5 * i);
	//
	// }
	
	static void gauss(int num){
		int sum = 0;
		for(int i=1; i<num+1; i++)
			sum += i;
		System.out.println("1���� "+num+"������ ���� "+sum+"�Դϴ�.");
	}
	
	

	public static void main(String[] args) {

//		printGuGuDan(3);
		
		gauss(100);
		//1���� 100������ ���� 5050�Դϴ�.
		gauss(1000);
		//1���� 1000������ ���� 500500�Դϴ�.
	}
}
