package d20160509;

//boolean : true = 1, false = 0;
//����Ű : ���� : ctrl + c ; �ٿ��ֱ� : ctrl + v
//			�߶󳻱� : ctrl + x ; ���� : ctrl + s
//�����̵� : alt + ȭ��ǥ ���� ���Ʒ�

//5���� ������ : ��Ʈ ������
//and ==> &, or ==> |
public class VarEx5 {
	public static void main(String[] args) {
		byte a = 10; // 0000 1010;
		byte b = 22; // 0001 0110;
		
		int c = a&b; // 0000 0010;
		int d = a|b; // 0001 1110;
		System.out.println(c); //int�� c�� ���
		System.out.println(d); //int�� d�� ���
		
		boolean b1 = true; //���� ���� b1�� true���� ����
		boolean b2 = false; //���� ���� b2�� false ���� ����
		
		System.out.println("b1 & b2 : " + (b1 & b2)); //b1�� b2�� ��Ʈ�����Ͽ� ���
		
	}
}
