package d20160504;

public class VarEx4 {
	public static void main(String[] args) {
		// �ڷ��� ������ = ���;
		// ��� ������ ;�� ���� ������
		int i = 20; //i�̶�� �̸���  int��ũ�� ���� �����ϰ� 20 ����
		System.out.println("i : " + i);
		
		char c = 'a'; //c�̶�� �̸���  char��ũ�� ���� �����ϰ� a��� ���ڸ� ����
		System.out.println("c : " + c);
		
		char d1 = 'J'; //d1�̶�� �̸���  char��ũ�� ���� �����ϰ� J��� ���ڸ� ����
		char d2 = 'A'; //d2�̶�� �̸���  char��ũ�� ���� �����ϰ� A��� ���ڸ� ����
		char d3 = 'V'; //d3�̶�� �̸���  char��ũ�� ���� �����ϰ� V��� ���ڸ� ����
		char d4 = 'A'; //d4�̶�� �̸���  char��ũ�� ���� �����ϰ� A��� ���ڸ� ����
		System.out.println(""+d1+d2+d3+d4);
		
		String str = "Hello Java World";
		System.out.println(str);
		////////////////////////////////////
		
		char c1 = 'A';
//		char c2 = 'AB';
		String s1 = "A";
		String s2 = "AB";
		
		char ch1 = 'a'; //����
		char ch2 = 97; // ASCII �ڵ�
		char ch3 = '\u0061'; // unicode
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		System.out.println("ch3 : "+ch3);
		//���ڿ� + ���� -> ����
		//���� + ���� -> ���������
		System.out.println(d1+d2);//���������
		System.out.println(""+d1+d2);//���� ������
		//������ ASCII �ڵ� + ASCII �ڵ�
	}
}
