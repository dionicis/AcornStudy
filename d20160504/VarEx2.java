package d20160504;

public class VarEx2 {
		//�ڹ��� ��� ������ �ݵ�� �ʱ�ȭ �ؼ� ����ؾ� �մϴ�.
	public static void main(String[] args) {
		//������ �����ϸ鼭 ���� ���� : �ʱ�ȭ
		byte b1 = 10; //b1�̶�� �̸���  byteũ�� ���� �����ϰ� 10�� ����
		byte b2 = 20; //b2�̶�� �̸���  byteũ�� ���� �����ϰ� 10�� ����
		
		System.out.println(b1+b2); //b1�� b2�� ���Ѱ��� ���
		
		short sh1 = 150;
		
		//sh1 = b1; // �Ͻ��� ����ȯ
		sh1 = b1;//sh1�� b1�� ����ִ� ���� ����
		
		b1 = (byte) sh1; // ����� ����ȯ
		System.out.println(b1);
	}
}
