package d20160521;

public class StringEx2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Java Oracle";

		char ch = str.charAt(3);

		System.out.println("ch : " + ch);
		String str2 = "������";
		System.out.println(str.concat(str2));

		String s1 = "������";
		String s2 = "ȭ����";
		String s3 = "������";
		String s4 = "�����";
		String s5 = "�ݿ���";
		String s6 = "�����";
		String s7 = "�Ͽ���";

		// method chain
		System.out.println(s1.concat(" " + s2).concat(" " + s3).concat(" " + s4).concat(" " + s5).concat(" " + s6)
				.concat(" " + s7));

		System.out.println();
		String t = str.concat(str2);
		System.out.println("t : " + t);
		System.out.println(str.contains("Java"));// String str�� ���ڿ� "Java"�� �ִ���
													// true false�� ��ȯ

		if (str.equalsIgnoreCase("JAVA ORACLE"))// ��ҹ��� �����ϰ� �����
			System.out.println("��ҹ��ڰ� �ٸ�");

		int idx = str.indexOf('r');// 'r'�̶�� ���ڰ� ���° �ִ��� int�� ������ ��ȯ
		System.out.println(idx);

		// ���ڿ��� �κ�����
		// 2������ 6�������� ����
		// Java Oracle
		System.out.println(str.substring(2, 6));// va O

		char[] chArray = str.toCharArray(); // ���ڿ��� ���� �迭�� �ٲ��ִ� �޼ҵ�

		for (char c : chArray)
			System.out.print(c + " ");// chArr �迭�� ���ڸ� ���
		System.out.println();

		int a = 20;
		String value = String.valueOf(a);// ���� 20�� ���ڿ� 20���� ��ȯ
		System.out.println(value);

		System.out.println("======================");

		String email = "dagda@hanafos.com";
		int index = email.indexOf('@');
		String id = email.substring(0, index);
		System.out.println(id);
		System.out.println(email.substring(0, email.indexOf('@')));

		System.out.println("=======================");
		String txt = "������,������,������,ȭ����";

		for (String s : txt.split(","))
			System.out.println(s);

	}
}
