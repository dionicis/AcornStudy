package d20160504;

public class Hw01 {
	public static void main(String[] args) {
		int m1 = 100; //int�� �ڷ��� m1�� �����ϰ� 100�� ����
		byte b1 = 20; //b1�� �ڷ��� m1�� �����ϰ� 100�� ����
		short sh1 = 200; //sh1�� �ڷ��� m1�� �����ϰ� 100�� ����
		int k = m1 + b1; //b1�� �ڷ��� m1�� �����ϰ� 100�� ����
		System.out.println("k : " + (m1 + b1));
		
//		byte b2 = k;// int Ÿ�� �ڷ�����  byte Ÿ�Կ� �����߱� ����
		int b2 = k;
		
//		byte b3 = 300;// byte�� ������ �Ѵ´�
		short b3 = 300;
//		int k = k +1; //�ʱ�ȭ�� 2����
		k = k+1;
		System.out.println("k: " + k);
	}
}
