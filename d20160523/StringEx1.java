package d20160523;

public class StringEx1 {
	public static void main(String[] args) {
		String str1 = new String("Java");
		String str2 = new String("Java");
		

		System.out.println(str1);
		System.out.println(str2);
		// String class�� toString();

		// Object Ŭ������ toString()�� �������̵� �߱� ������
		// �ڱ� �ڽ��� ���ڿ��� ����� �� �ִ�.

		System.out.println("========================");
		if (str1 == str2) {// ������ ��
			System.out.println("���� ��ü");
		}
		else
			System.out.println("�ٸ� ��ü");


		//Object : equals() : ������ �� �޼���
		//String : equals() : ���� �� �޼��� - Override
		if (str1.equals(str2))// �����
			System.out.println("������ ���ڿ�");
		else
			System.out.println("�ٸ� ���ڿ�");
		
		
		System.out.println("========================");
		String str3 = "Java";
		String str4 = "Java";
		
		if(str3 == str4)
			System.out.println("O");
		else
			System.out.println("X");
		
		str3 = "Oracle";
		System.out.println(str4);
	}
}
