package d20160504;

public class VarEx3 {
	public static void main(String[] atgs){
		//int ���� ũ���� �ڷ������� �����Ҷ���
		//�ڵ����� int �� ����ȯ �Ѵ�.
		byte b1 = 10; //b1�̶�� �̸���  byteũ�� ���� �����ϰ� 10�� ����
		byte b2 = 20; //b2�̶�� �̸���  byteũ�� ���� �����ϰ� 20�� ����
		short sh1 = 30; //sh1�̶�� �̸���  shortũ�� ���� �����ϰ� 30�� ����
		
//		byte b3 = b1+b2; //���� int ��
		byte b3 = (byte) (b1+b2);
		int i = b1+b2; //i�̶�� �̸���  int��ũ�� ���� �����ϰ� b1�� b2�� ���� ����
		
		System.out.println("i : " + i); 
		System.out.println("b3 : " + b3);
		
		int sh2 = sh1+b2; //sh2�̶�� �̸���  int�� ũ�� ���� �����ϰ� sh1�� b2�� ����
		System.out.println("sh2 : " + sh2);
		///////////////////////////////////////////////
		
		int a = 200; //a�̶�� �̸���  int��ũ�� ���� �����ϰ� 200 ����
		long c = 300L; //c�̶�� �̸���  long��ũ�� ���� �����ϰ� 300 ����
		
		long d = a+c; //d�̶�� �̸���  long��ũ�� ���� �����ϰ� a�� c�� ���� ����
		System.out.println("d : " + d);
		///////////////////////////////////////////////
		
		float f1 = 300.2f; //f1�̶�� �̸���  float��ũ�� ���� �����ϰ� 300.2 ����
		double d1 = 3090.20d; //d1�̶�� �̸���  double��ũ�� ���� �����ϰ� 300 ����
		
		double k1 = f1 + d1; //k1�̶�� �̸���  double��ũ�� ���� �����ϰ� f1��d1�� ���� ����
		System.out.println("k1 : "+k1);
	}
}
